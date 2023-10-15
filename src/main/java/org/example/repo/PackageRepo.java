package org.example.repo;

import org.example.entity.PackageEntity;
import org.example.entity.TravelAreaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepo extends CrudRepository<PackageEntity,String> {
//    PackageEntity save(PackageEntity packageEntity);
//    PackageEntity  getById(String package_id);
//    void deleteById(String package_id);
}
