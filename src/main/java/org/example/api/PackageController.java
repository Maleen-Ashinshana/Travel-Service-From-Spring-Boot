package org.example.api;

import jakarta.validation.Valid;
import org.example.dto.PackageDTO;
import org.example.dto.TravelAreaDTO;
import org.example.service.PackageService;
import org.example.service.TravelAreaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/area")
public class PackageController {
    private final PackageService packageService;

    public PackageController(PackageService packageService) {
        this.packageService = packageService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    PackageDTO savePackage(@Valid @RequestBody PackageDTO packageDTO, Errors errors){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PackageDTO> getArea(@Valid @PathVariable String package_id){
        return null;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping()
    void deletePackage(@Valid @PathVariable String package_id,@RequestBody PackageDTO packageDTO,Errors errors){

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping()
    void updatePackage(@Valid @PathVariable String package_id,@RequestBody PackageDTO packageDTO,Errors errors){

    }
}
