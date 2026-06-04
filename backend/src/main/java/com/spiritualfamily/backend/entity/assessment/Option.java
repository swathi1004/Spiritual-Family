// ======================================================
// entity/assessment/Option.java
// ======================================================

package com.spiritualfamily.backend.entity.assessment;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "options")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String optionText;

    private Boolean isCorrect = false;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;
}