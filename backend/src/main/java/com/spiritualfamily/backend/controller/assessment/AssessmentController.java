package com.spiritualfamily.backend.controller.assessment;

import com.spiritualfamily.backend.dto.assessment.*;
import com.spiritualfamily.backend.service.assessment.AssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessments")
@RequiredArgsConstructor
public class AssessmentController {

    private final AssessmentService service;

    @PostMapping
    public ResponseEntity<AssessmentResponse>
    create(
            @RequestBody AssessmentRequest request
    ) {

        return ResponseEntity.ok(
                service.create(request)
        );
    }

    @GetMapping
    public ResponseEntity<List<AssessmentResponse>>
    findAll() {

        return ResponseEntity.ok(
                service.findAll()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssessmentResponse>
    findById(
            @PathVariable Long id
    ) {

        return ResponseEntity.ok(
                service.findById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>
    delete(
            @PathVariable Long id
    ) {

        service.delete(id);

        return ResponseEntity.ok(
                "Assessment Deleted"
        );
    }
}