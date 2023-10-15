package org.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.entity.MainTravelServiceEntity;
import org.example.entity.TravelAreaImage;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
@ToString
public class TravelAreaDTO implements Serializable {
    @NotNull
    private String id;
    @NotNull
    private String travel_area;


    public TravelAreaDTO(String id, String travel_area) {
        this.id = id;
        this.travel_area = travel_area;
    }
}
