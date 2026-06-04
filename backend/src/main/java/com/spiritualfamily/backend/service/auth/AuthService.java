// service/auth/AuthService.java

package com.spiritualfamily.backend.service.auth;

import java.util.Set;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spiritualfamily.backend.dto.auth.AuthResponse;
import com.spiritualfamily.backend.dto.auth.
LoginRequest;
import com.spiritualfamily.backend.dto.auth.
RegisterRequest;
import com.spiritualfamily.backend.entity.enums.
RoleType;
import com.spiritualfamily.backend.entity.user.Role;
import com.spiritualfamily.backend.entity.user.User;
import com.spiritualfamily.backend.repository.user.RoleRepository;
import com.spiritualfamily.backend.repository.user.UserRepository;
import com.spiritualfamily.backend.security.JwtService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthResponse register(
            RegisterRequest request
    ) {

        if (userRepository.existsByEmail(request.getEmail())) {

            throw new RuntimeException(
                    "Email already exists"
            );
        }

        Role memberRole = roleRepository
                .findByName(RoleType.MEMBER)
                .orElseThrow();

        User user = User.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .password(
                        passwordEncoder.encode(
                                request.getPassword()
                        )
                )
                .phone(request.getPhone())
                .emailVerified(true)
                .roles(Set.of(memberRole))
                .build();

        userRepository.save(user);

        String token =
                jwtService.generateToken(
                        new org.springframework.security.core.userdetails.User(
                                user.getEmail(),
                                user.getPassword(),
                                java.util.List.of()
                        )
                );

        return AuthResponse.builder()
                .token(token)
                .message("Registration successful")
                .build();
    }

    public AuthResponse login(
            LoginRequest request
    ) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        User user = userRepository.findByEmail(
                request.getEmail()
        ).orElseThrow();

        String token =
                jwtService.generateToken(
                        new org.springframework.security.core.userdetails.User(
                                user.getEmail(),
                                user.getPassword(),
                                java.util.List.of()
                        )
                );

        return AuthResponse.builder()
                .token(token)
                .message("Login successful")
                .build();
    }
}