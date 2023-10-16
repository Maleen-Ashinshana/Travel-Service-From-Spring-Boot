package org.example.service.util;

import lombok.RequiredArgsConstructor;
import org.example.dto.MainTravelServiceDTO;
import org.example.entity.MainTravelServiceEntity;
import org.example.entity.PackageEntity;
import org.example.entity.TravelAreaEntity;
import org.example.repo.MainTravelServiceRepo;
import org.example.repo.PackageRepo;
import org.example.repo.TravelAreaRepo;
import org.example.service.MainTravelService;
import org.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MainTravelServiceIMPL implements MainTravelService {

    private final Converter converter;

    private final MainTravelServiceRepo mainTravelServiceRepo;
    private final PackageRepo packageRepo;

    @Override
    public MainTravelServiceDTO saveService(String user_id, String vehicle_id,String package_id,String hotel_id,String travel_area_id,MainTravelServiceDTO serviceDTO) {

return null;
    }

    @Override
    public MainTravelServiceDTO getSelectService(String service_id) {
        return null;
    }

    @Override
    public void updateService(String service_id) {

    }

    @Override
    public void deleteService(String service_id) {

    }
}
