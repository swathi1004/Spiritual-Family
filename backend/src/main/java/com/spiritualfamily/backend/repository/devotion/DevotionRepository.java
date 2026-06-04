// ======================================================
// repository/devotion/DevotionRepository.java
// ======================================================

package com.spiritualfamily.backend.repository.devotion;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spiritualfamily.backend.entity.devotion.Devotion;

public interface DevotionRepository
        extends JpaRepository<Devotion, Long> {
}