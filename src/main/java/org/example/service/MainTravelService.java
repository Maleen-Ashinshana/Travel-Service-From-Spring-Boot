package org.example.service;

import org.example.dto.MainTravelServiceDTO;

public interface MainTravelService {
    MainTravelServiceDTO saveService(MainTravelServiceDTO serviceDTO);
    MainTravelServiceDTO getSelectService(String service_id);
    void  updateService(String service_id);
    void deleteService(String service_id);
}
