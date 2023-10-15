package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class TravelAreaEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String travel_area;
    @OneToMany(mappedBy = "travelAreaEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelAreaImage>  travelAreaImages;

    @OneToMany(mappedBy = "travelAreaEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MainTravelServiceEntity> serviceEntities;

    /*@OneToMany(mappedBy = "travelArea", cascade = CascadeType.ALL)
    private List<TravelAreaImage> images;

    @OneToMany(mappedBy = "travelArea", cascade = CascadeType.ALL)
    private List<MainTravelServiceEntity> serviceEntities;*/

    public TravelAreaEntity(String id, String travel_area) {
        this.id = id;
        this.travel_area = travel_area;
    }
}
