package org.example.service.util;

import org.example.dto.TravelAreaDTO;
import org.example.repo.TravelAreaRepo;
import org.example.service.TravelAreaService;
import org.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TravelAreaServiceIMPL implements TravelAreaService {

    @Autowired
    private Converter converter;
    @Autowired
    private TravelAreaRepo travelAreaRepo;

    @Override
    public TravelAreaDTO saveArea(TravelAreaDTO travelAreaDTO) {
        return null;
    }

    @Override
    public TravelAreaDTO getSelectArea(String area_id) {
        return null;
    }

    @Override
    public void updateArea(String area_id) {

    }

    @Override
    public void deleteArea(String area_id) {

    }
}
