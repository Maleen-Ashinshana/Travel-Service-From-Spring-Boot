package org.example.service;

import org.example.dto.MainTravelServiceDTO;
import org.example.dto.TravelAreaDTO;

public interface TravelAreaService {
    TravelAreaDTO saveArea(TravelAreaDTO travelAreaDTO);
    TravelAreaDTO getSelectArea(String area_id);
    void  updateArea(String area_id,TravelAreaDTO areaDTO);
    void deleteArea(String area_id);
}
