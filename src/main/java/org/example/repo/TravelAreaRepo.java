package org.example.repo;

import org.example.entity.TravelAreaEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelAreaRepo extends CrudRepository<TravelAreaEntity,String> {
//    TravelAreaEntity save(TravelAreaEntity travelAreaEntity);
//    TravelAreaEntity getById(String area_id);
//    void deleteById(String area_id);
}
