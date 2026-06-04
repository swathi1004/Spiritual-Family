// ======================================================
// repository/attendance/AttendanceSessionRepository.java
// ======================================================

package com.spiritualfamily.backend.repository.attendance;

import com.spiritualfamily.backend.entity.attendance.AttendanceSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceSessionRepository
        extends JpaRepository<AttendanceSession, Long> {
}