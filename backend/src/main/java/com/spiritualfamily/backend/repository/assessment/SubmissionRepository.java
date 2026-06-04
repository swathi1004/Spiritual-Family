// ======================================================
// repository/assessment/SubmissionRepository.java
// ======================================================

package com.spiritualfamily.backend.repository.assessment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spiritualfamily.backend.entity.assessment.Submission;

public interface SubmissionRepository
        extends JpaRepository<Submission, Long> {
}