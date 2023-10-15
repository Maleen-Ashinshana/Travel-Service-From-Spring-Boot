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
    private String image_id;
    @NotNull
    private String image1;
    @NotNull
    private String image2;
    @NotNull
    private String image3;
    @NotNull
    private String travel_area_id;
}
