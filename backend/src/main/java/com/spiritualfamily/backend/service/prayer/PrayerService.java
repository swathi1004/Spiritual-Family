// PrayerService.java

package com.spiritualfamily.backend.service.prayer;

import com.spiritualfamily.backend.dto.prayer.*;
import com.spiritualfamily.backend.entity.enums.PrayerStatus;
import com.spiritualfamily.backend.entity.prayer.PrayerRequest;
import com.spiritualfamily.backend.entity.user.User;
import com.spiritualfamily.backend.repository.prayer.PrayerRequestRepository;
import com.spiritualfamily.backend.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrayerService {

    private final PrayerRequestRepository prayerRepository;
    private final UserRepository userRepository;

    public PrayerResponseDto create(
            PrayerRequestDto dto
    ) {

        User user = userRepository
                .findById(dto.getUserId())
                .orElseThrow();

        PrayerRequest prayer =
                PrayerRequest.builder()
                        .title(dto.getTitle())
                        .requestText(dto.getRequestText())
                        .submittedBy(user)
                        .status(
                                PrayerStatus.PENDING
                        )
                        .build();

        prayer = prayerRepository.save(prayer);

        return PrayerResponseDto.builder()
                .id(prayer.getId())
                .title(prayer.getTitle())
                .requestText(
                        prayer.getRequestText()
                )
                .build();
    }

    public List<PrayerRequest> findAll() {
        return prayerRepository.findAll();
    }
}