package org.example.service;

import org.example.dto.MainTravelServiceDTO;
import org.example.dto.PackageDTO;

public interface PackageService {
    PackageDTO savePackage(PackageDTO packageDTO);
    PackageDTO getSelectPackage(String package_id);
    void  updatePackage(String package_id);
    void deletePackage(String package_id);
}
