package org.example.repo;

import org.example.entity.TravelAreaEntity;
import org.example.entity.TravelAreaImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelImageRepo extends JpaRepository<TravelAreaImage,String> {
    TravelAreaImage save(TravelAreaImage travelAreaImage);
    TravelAreaImage getByImage_id(String image_id);
    void deleteByImage_id(String image_id);


}
