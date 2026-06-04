package com.spiritualfamily.backend.entity.assessment;

import com.spiritualfamily.backend.entity.enums.QuestionType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Assessment assessment;

    @Column(length = 3000)
    private String englishQuestion;

    @Column(length = 3000)
    private String teluguQuestion;

    @Enumerated(EnumType.STRING)
    private QuestionType questionType;

    private String imageUrl;

    private String correctAnswer;

    @OneToMany(mappedBy = "question")
    private List<Option> options;
}