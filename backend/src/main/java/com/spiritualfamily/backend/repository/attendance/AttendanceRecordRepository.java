// ======================================================
// repository/attendance/AttendanceRecordRepository.java
// ======================================================

package com.spiritualfamily.backend.repository.attendance;

import com.spiritualfamily.backend.entity.attendance.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRecordRepository
        extends JpaRepository<AttendanceRecord, Long> {
}