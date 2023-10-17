package org.example.repo;

import org.example.entity.TravelPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepo extends CrudRepository<TravelPackage,String> {
//    PackageEntity save(PackageEntity packageEntity);
//    PackageEntity  getById(String package_id);
//    void deleteById(String package_id);
}
