package org.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.example.entity.TravelAreaEntity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TravelImageDTO {
    @NotNull
    private int image_id;
    @NotNull
    private String image1;
    @NotNull
    private String image2;
    @NotNull
    private String image3;

    private TravelAreaEntity travelAreaEntity;
}
