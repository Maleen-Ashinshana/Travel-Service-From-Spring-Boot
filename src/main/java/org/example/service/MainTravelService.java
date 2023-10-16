package org.example.service;

import org.apache.catalina.authenticator.SavedRequest;
import org.example.dto.MainTravelServiceDTO;

public interface MainTravelService {
    MainTravelServiceDTO saveService(String user_id, String vehicle_id,String package_id,String hotel_id,String travel_area_id, MainTravelServiceDTO serviceDTO);
    MainTravelServiceDTO getSelectService(String service_id);
    void  updateService(String service_id);
    void deleteService(String service_id);
}
