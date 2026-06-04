package com.spiritualfamily.backend.repository.assessment;

import com.spiritualfamily.backend.entity.assessment.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository
        extends JpaRepository<Answer, Long> {
}