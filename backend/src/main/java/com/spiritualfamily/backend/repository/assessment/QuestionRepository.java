package com.spiritualfamily.backend.repository.assessment;

import com.spiritualfamily.backend.entity.assessment.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository
        extends JpaRepository<Question, Long> {
}