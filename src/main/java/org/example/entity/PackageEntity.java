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
@Table(name = "package")
@ToString
public class PackageEntity implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String package_id;
    @Column(nullable = false)
    private String package_cetagory;
    @Column(nullable = false)
    private String package_hotel_cetagory;
    @Column(nullable = false)
    private String package_vehicle_cetagory;

    @OneToMany(mappedBy = "packageEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MainTravelServiceEntity> serviceEntities;
}
