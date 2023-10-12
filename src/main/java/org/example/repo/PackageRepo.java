package org.example.repo;

import org.example.entity.PackageEntity;
import org.example.entity.TravelAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepo extends JpaRepository<PackageEntity,String> {
    PackageEntity save(PackageEntity packageEntity);
    PackageEntity  getById(String package_id);
    void deleteById(String package_id);
}
