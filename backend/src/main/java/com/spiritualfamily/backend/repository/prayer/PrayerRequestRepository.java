// PrayerRequestRepository.java

package com.spiritualfamily.backend.repository.prayer;

import com.spiritualfamily.backend.entity.prayer.PrayerRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrayerRequestRepository
        extends JpaRepository<PrayerRequest, Long> {
}