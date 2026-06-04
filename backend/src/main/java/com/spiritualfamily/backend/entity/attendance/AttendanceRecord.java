// ======================================================
// entity/attendance/AttendanceRecord.java
// ======================================================

package com.spiritualfamily.backend.entity.attendance;

import com.spiritualfamily.backend.entity.enums.AttendanceStatus;
import com.spiritualfamily.backend.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "attendance_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AttendanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AttendanceStatus status;

    @ManyToOne
    @JoinColumn(name = "attendance_session_id", nullable = false)
    private AttendanceSession attendanceSession;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDateTime markedAt;

    @PrePersist
    public void prePersist() {
        this.markedAt = LocalDateTime.now();
    }
}