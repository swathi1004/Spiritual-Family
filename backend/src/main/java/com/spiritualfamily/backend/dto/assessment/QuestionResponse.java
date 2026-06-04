package com.spiritualfamily.backend.dto.assessment;

import com.spiritualfamily.backend.entity.enums.QuestionType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionResponse {

    private Long id;

    private Long assessmentId;

    private String englishQuestion;

    private String teluguQuestion;

    private QuestionType questionType;

    private String imageUrl;

    private String correctAnswer;
}