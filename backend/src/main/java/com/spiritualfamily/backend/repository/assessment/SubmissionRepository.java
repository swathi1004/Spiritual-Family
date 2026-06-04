package com.spiritualfamily.backend.repository.assessment;

import com.spiritualfamily.backend.entity.assessment.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository
        extends JpaRepository<Submission, Long> {
}