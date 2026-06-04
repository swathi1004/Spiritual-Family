package com.spiritualfamily.backend.service.assessment;

import com.spiritualfamily.backend.dto.assessment.*;
import com.spiritualfamily.backend.entity.assessment.Assessment;
import com.spiritualfamily.backend.repository.assessment.AssessmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssessmentService {

    private final AssessmentRepository repository;

    public AssessmentResponse create(
            AssessmentRequest request
    ) {

        Assessment assessment =
                Assessment.builder()
                        .title(request.getTitle())
                        .description(request.getDescription())
                        .type(request.getType())
                        .deadline(request.getDeadline())
                        .active(true)
                        .build();

        assessment = repository.save(assessment);

        return map(assessment);
    }

    public List<AssessmentResponse> findAll() {

        return repository.findAll()
                .stream()
                .map(this::map)
                .toList();
    }

    public AssessmentResponse findById(Long id) {

        return map(
                repository.findById(id)
                        .orElseThrow()
        );
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private AssessmentResponse map(
            Assessment assessment
    ) {

        return AssessmentResponse.builder()
                .id(assessment.getId())
                .title(assessment.getTitle())
                .description(assessment.getDescription())
                .type(assessment.getType())
                .deadline(assessment.getDeadline())
                .active(assessment.getActive())
                .build();
    }
}