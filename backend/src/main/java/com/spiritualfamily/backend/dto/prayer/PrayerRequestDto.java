// PrayerRequestDto.java

package com.spiritualfamily.backend.dto.prayer;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrayerRequestDto {

    private String title;
    private String requestText;
    private Long userId;
}