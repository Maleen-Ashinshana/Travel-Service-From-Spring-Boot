package org.example.service.util;

import org.example.dto.TravelAreaDTO;
import org.example.entity.TravelAreaEntity;
import org.example.exception.NotFoundException;
import org.example.repo.TravelAreaRepo;
import org.example.service.TravelAreaService;
import org.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class TravelAreaServiceIMPL implements TravelAreaService {

    @Autowired
    private Converter converter;
    @Autowired
    private TravelAreaRepo travelAreaRepo;

    @Override
    public TravelAreaDTO saveArea(TravelAreaDTO travelAreaDTO) {
        return converter.toAreaDto(travelAreaRepo.save(converter.toAreaEntity(travelAreaDTO)));
    }

    @Override
    public TravelAreaDTO getSelectArea(String area_id) {
        Optional<TravelAreaEntity> byId = travelAreaRepo.findById(area_id);
        if (!byId.isPresent()){
            throw new NotFoundException("Travel Area Id Is Not Found :"+area_id);
        }
        return converter.toAreaDto(byId.get());
    }

    @Override
    public void updateArea(String area_id,TravelAreaDTO areaDTO) {
        Optional<TravelAreaEntity> byId = travelAreaRepo.findById(area_id);
        if (!byId.isPresent()){
            throw new NotFoundException("Travel Area Id Is Not Found :"+area_id);
//            byId.get().setTravel_area(areaDTO.getTravel_area());
        }
        TravelAreaEntity travelArea=byId.get();
        travelArea.setTravel_area(areaDTO.getTravel_area());
        travelAreaRepo.save(travelArea);
    }

    @Override
    public void deleteArea(String area_id) {
        Optional<TravelAreaEntity> byId = travelAreaRepo.findById(area_id);
        if (!byId.isPresent()){
            throw new NotFoundException("Travel Area Id Is Not Found :" + area_id);
        }
        travelAreaRepo.deleteById(area_id);
    }
}
