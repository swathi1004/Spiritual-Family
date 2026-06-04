// PrayerRequest.java

package com.spiritualfamily.backend.entity.prayer;

import com.spiritualfamily.backend.entity.enums.PrayerStatus;
import com.spiritualfamily.backend.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "prayer_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrayerRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 5000)
    private String requestText;

    @Enumerated(EnumType.STRING)
    private PrayerStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User submittedBy;

    @Builder.Default
    private LocalDateTime createdAt =
            LocalDateTime.now();
}