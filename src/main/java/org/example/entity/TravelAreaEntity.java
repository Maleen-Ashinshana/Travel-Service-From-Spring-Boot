package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "travelArea")
public class TravelAreaEntity implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String travel_area;
    @OneToMany(mappedBy = "travelAreaEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelAreaImage> billEntities;

    @OneToMany(mappedBy = "travelAreaEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MainTravelServiceEntity> serviceEntities;

    /*@OneToMany(mappedBy = "travelArea", cascade = CascadeType.ALL)
    private List<TravelAreaImage> images;

    @OneToMany(mappedBy = "travelArea", cascade = CascadeType.ALL)
    private List<MainTravelServiceEntity> serviceEntities;*/

    public TravelAreaEntity(int id, String travel_area) {
        this.id = id;
        this.travel_area = travel_area;
    }
}
