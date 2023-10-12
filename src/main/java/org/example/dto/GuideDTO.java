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
public class GuideDTO implements Serializable {
    private String guide_id;
    @NotBlank
    private String guide_name;
    @NotBlank
    private String address;
    @NotBlank
    private int age;
    @NotBlank
    private int contact_number;
    @NotBlank
    private String gender;
}
