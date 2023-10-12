package org.example.service.util;

import org.example.dto.MainTravelServiceDTO;
import org.example.repo.MainTravelServiceRepo;
import org.example.service.MainTravelService;
import org.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MainTravelServiceIMPL implements MainTravelService {
    @Autowired
    private Converter converter;
    @Autowired
    private MainTravelServiceRepo mainTravelServiceRepo;
    @Override
    public MainTravelServiceDTO saveService(MainTravelServiceDTO serviceDTO) {
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
