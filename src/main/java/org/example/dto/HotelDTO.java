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
public class HotelDTO implements Serializable {
    private String hotel_id;
    @NotBlank
    private  String hotel_name;
    @NotBlank
    private  String hotel_category;
    @NotBlank
    private  String location;
    @NotBlank
    private  String email;
    @NotBlank
    private  int contact_number;
}
