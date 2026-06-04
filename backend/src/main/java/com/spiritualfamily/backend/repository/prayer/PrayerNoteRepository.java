package com.spiritualfamily.backend.repository.prayer;

import com.spiritualfamily.backend.entity.prayer.PrayerNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrayerNoteRepository
        extends JpaRepository<PrayerNote, Long> {
}