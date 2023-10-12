package org.example.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VehicleDTO implements Serializable {
    private String vehicle_id;
    @NotBlank
    private String vehicle_brand;
    @NotBlank
    private String vehicle_category;
    @NotBlank
    private String vehicle_image;
    @NotBlank
    private String fuel_type;
    @NotBlank
    private String fuel_usage;
    @NotBlank
    private int seat_capacity;
    @NotBlank
    private String transmission;
}
