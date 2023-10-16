package org.example.service;

import org.example.dto.TravelAreaDTO;
import org.example.dto.TravelImageDTO;

public interface TravelImageService {
    TravelImageDTO saveImage(String area_id,TravelImageDTO imageDTO);
    TravelImageDTO getSelectImage(String image_id);
    void  updateImage(String image_id,TravelImageDTO travelImageDTO);
    void deleteImage(String image_id);
}
