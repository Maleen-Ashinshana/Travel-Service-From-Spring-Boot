package org.example.api;

import jakarta.validation.Valid;
import org.example.dto.MainTravelServiceDTO;
import org.example.dto.TravelAreaDTO;
import org.example.repo.MainTravelServiceRepo;
import org.example.service.MainTravelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/service")
public class MainTravelController {
    private  final MainTravelService travelService;

    public MainTravelController(MainTravelService travelService) {
        this.travelService = travelService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    MainTravelServiceDTO saveTravel(@Valid @RequestBody MainTravelServiceDTO serviceDTO, Errors errors){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<MainTravelServiceDTO> getTravel(@Valid @PathVariable String travel_id){
        return null;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping()
    void deleteTravel(@Valid @PathVariable String travel_id,@RequestBody MainTravelServiceDTO serviceDTO,Errors errors){

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping()
    void updateTravel(@Valid @PathVariable String travel_id,@RequestBody MainTravelServiceDTO serviceDTO,Errors errors){

    }
}
