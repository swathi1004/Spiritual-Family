package com.spiritualfamily.backend.entity.assessment;

import com.spiritualfamily.backend.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "submissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Assessment assessment;

    @ManyToOne
    private User user;

    private Integer score;

    private Boolean submitted;

    private LocalDateTime submittedAt;

    @OneToMany(mappedBy = "submission")
    private List<Answer> answers;
}