// PrayerController.java

package com.spiritualfamily.backend.controller.prayer;

import com.spiritualfamily.backend.dto.prayer.*;
import com.spiritualfamily.backend.entity.prayer.PrayerRequest;
import com.spiritualfamily.backend.service.prayer.PrayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prayer-requests")
@RequiredArgsConstructor
public class PrayerController {

    private final PrayerService prayerService;

    @PostMapping
    public PrayerResponseDto create(
            @RequestBody PrayerRequestDto dto
    ) {
        return prayerService.create(dto);
    }

    @GetMapping
    public List<PrayerRequest> getAll() {
        return prayerService.findAll();
    }
}