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
public class PackageDTO implements Serializable {
    private String package_id;
    @NotBlank
    private String package_cetagory;
    @NotBlank
    private String package_hotel_cetagory;
    @NotBlank
    private String package_vehicle_cetagory;
}
