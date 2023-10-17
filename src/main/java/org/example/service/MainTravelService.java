package org.example.service;

import org.apache.catalina.authenticator.SavedRequest;
import org.example.dto.MainTravelServiceDTO;

public interface MainTravelService {
    MainTravelServiceDTO saveService( MainTravelServiceDTO serviceDTO);
    MainTravelServiceDTO getSelectService(String service_id);
    void  updateService(String service_id,MainTravelServiceDTO serviceDTO);
    void deleteService(String service_id);
}
