package org.example.service.util;

import org.example.dto.PackageDTO;
import org.example.repo.MainTravelServiceRepo;
import org.example.repo.PackageRepo;
import org.example.service.PackageService;
import org.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PackageServiceIMPL implements PackageService {
    @Autowired
    private Converter converter;
    @Autowired
    private PackageRepo packageRepo;

    @Override
    public PackageDTO savePackage(PackageDTO packageDTO) {
        return null;
    }

    @Override
    public PackageDTO getSelectPackage(String package_id) {
        return null;
    }

    @Override
    public void updatePackage(String package_id) {

    }

    @Override
    public void deletePackage(String package_id) {

    }
}
