package org.example.repo;

import org.example.entity.MainTravelServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainTravelServiceRepo extends JpaRepository<MainTravelServiceEntity,String> {
    MainTravelServiceEntity save(MainTravelServiceEntity travelService);
    MainTravelServiceEntity getMainTravelServiceEntitiesByiAndService_id(String service_id);
    void deleteMainTravelServiceEntitiesByService_id(String service_id);
}
