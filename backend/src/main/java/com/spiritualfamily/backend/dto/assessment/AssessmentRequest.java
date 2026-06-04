package com.spiritualfamily.backend.dto.assessment;

import com.spiritualfamily.backend.entity.enums.AssessmentType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentRequest {

    private String title;
    private String description;
    private AssessmentType type;
    private LocalDateTime deadline;
}