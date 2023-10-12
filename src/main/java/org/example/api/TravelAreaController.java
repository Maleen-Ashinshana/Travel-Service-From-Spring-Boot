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
@RequestMapping("api/v1/area")
public class TravelAreaController {
    private final TravelAreaService travelAreaService;

    public TravelAreaController(TravelAreaService travelAreaService) {
        this.travelAreaService = travelAreaService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    TravelAreaDTO saveArea(@Valid @RequestBody TravelAreaDTO  areaDTO, Errors errors){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TravelAreaDTO> getArea(@Valid @PathVariable String area_id){
        return null;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping()
    void deleteArea(@Valid @PathVariable String area_id,@RequestBody TravelAreaDTO  areaDTO,Errors errors){

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping()
    void updateArea(@Valid @PathVariable String area_id,@RequestBody TravelAreaDTO areaDTO,Errors errors){

    }
}
