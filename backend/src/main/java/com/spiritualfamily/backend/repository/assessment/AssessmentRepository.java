package com.spiritualfamily.backend.repository.assessment;

import com.spiritualfamily.backend.entity.assessment.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentRepository
        extends JpaRepository<Assessment, Long> {
}