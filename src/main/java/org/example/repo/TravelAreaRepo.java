package org.example.repo;

import org.example.entity.TravelAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelAreaRepo extends JpaRepository<TravelAreaEntity,String> {
    TravelAreaEntity save(TravelAreaEntity travelAreaEntity);
    TravelAreaEntity getById(String area_id);
    void deleteById(String area_id);
}
