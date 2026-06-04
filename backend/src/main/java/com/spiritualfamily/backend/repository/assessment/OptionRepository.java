package com.spiritualfamily.backend.repository.assessment;

import com.spiritualfamily.backend.entity.assessment.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository
        extends JpaRepository<Option, Long> {
}