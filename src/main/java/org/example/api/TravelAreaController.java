package org.example.api;

import jakarta.validation.Valid;
import org.example.dto.TravelAreaDTO;
import org.example.dto.TravelImageDTO;
import org.example.service.TravelAreaService;
import org.example.service.TravelImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/area")
public class TravelAreaController {
    private final TravelAreaService travelAreaService;

    public TravelAreaController(TravelAreaService travelAreaService) {
        this.travelAreaService = travelAreaService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    TravelAreaDTO saveArea(@Valid @RequestBody TravelAreaDTO  areaDTO, Errors errors){
        return travelAreaService.saveArea(areaDTO);
    }
    @GetMapping(value = "/{area_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TravelAreaDTO> getArea(@Valid @PathVariable String area_id){
        TravelAreaDTO selectArea = travelAreaService.getSelectArea(area_id);
        return new ResponseEntity<>(selectArea,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{area_id}")
    void deleteArea(@Valid @PathVariable String area_id){
        travelAreaService.deleteArea(area_id);

    }

    @PatchMapping("/{area_id}")
    void updateArea(@Valid @PathVariable String area_id,@RequestBody TravelAreaDTO areaDTO){
    travelAreaService.updateArea(area_id,areaDTO);
    }
}
