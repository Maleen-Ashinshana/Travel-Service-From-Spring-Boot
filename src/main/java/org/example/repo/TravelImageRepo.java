package org.example.repo;

import org.example.entity.TravelAreaEntity;
import org.example.entity.TravelAreaImage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelImageRepo extends CrudRepository<TravelAreaImage,String> {
//    TravelAreaImage save(TravelAreaImage travelAreaImage);
//    TravelAreaImage getByImage_id(String image_id);
//    void deleteByImage_id(String image_id);


}
