package org.example.service.util;

import lombok.RequiredArgsConstructor;
import org.example.dto.PackageDTO;
import org.example.entity.PackageEntity;
import org.example.repo.MainTravelServiceRepo;
import org.example.repo.PackageRepo;
import org.example.service.PackageService;
import org.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PackageServiceIMPL implements PackageService {

    private final Converter converter;

    private final PackageRepo packageRepo;

    @Override
    public PackageDTO savePackage(PackageDTO packageDTO) {
        return converter.toPackageDto(packageRepo.save(converter.toPackageEntity(packageDTO)));
    }

    @Override
    public PackageDTO getSelectPackage(String package_id) {
        return converter.toPackageDto(packageRepo.findById(package_id).get());
    }

    @Override
    public void updatePackage(PackageDTO packageDTO) {
        Optional<PackageEntity> byId = packageRepo.findById(packageDTO.getPackage_id());
        if (!byId.isPresent()){
            byId.get().setPackage_cetagory(packageDTO.getPackage_cetagory());
            byId.get().setPackage_hotel_cetagory(packageDTO.getPackage_hotel_cetagory());
            byId.get().setPackage_hotel_cetagory(packageDTO.getPackage_hotel_cetagory());
        }

    }

    @Override
    public void deletePackage(String package_id) {
 packageRepo.deleteById(package_id);
    }
}
