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
public class UserDTO implements Serializable {
    private String user_id;
    @NotBlank
    private String user_name;
    @NotBlank
    private String address;
    @NotBlank
    private String user_registration_time;
    @NotBlank
    private String email;
    @NotBlank
    private int age;
    @NotBlank
    private String password;
    @NotBlank
    private String nic_or_passport_number;

}
