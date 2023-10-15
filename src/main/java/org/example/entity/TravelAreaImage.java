package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data

@ToString
public class TravelAreaImage implements SuperEntity{
@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String image_id;
    @Column(nullable = false,columnDefinition = "LongText")
    @Lob
    private String image1;
    @Column(nullable = false,columnDefinition = "LongText")
    @Lob
    private String image2;
    @Column(nullable = false,columnDefinition = "LongText")
    @Lob
    private String image3;

    @ManyToOne
    private TravelAreaEntity travelAreaEntity;

    public TravelAreaImage(String image_id, String image1, String image2, String image3) {
        this.image_id = image_id;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }
}
