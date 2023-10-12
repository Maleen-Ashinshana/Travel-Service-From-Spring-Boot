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
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TravelAreaDTO implements Serializable {
    @NotNull
    private int id;
    @NotNull
    private String travel_area;
    @NotNull
    private List<TravelAreaImage> images;
    @NotNull
    private List<MainTravelServiceEntity> serviceEntities;
}
