// ======================================================
// repository/devotion/BibleVerseRepository.java
// ======================================================

package com.spiritualfamily.backend.repository.devotion;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spiritualfamily.backend.entity.devotion.BibleVerse;

public interface BibleVerseRepository
        extends JpaRepository<BibleVerse, Long> {

    Optional<BibleVerse> findByPostedDate(LocalDate postedDate);
}