package org.example.api;

import jakarta.validation.Valid;
import org.example.dto.MainTravelServiceDTO;
import org.example.service.MainTravelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/service")
public class MainTravelController {
    private  final MainTravelService travelService;

    public MainTravelController(MainTravelService travelService) {
        this.travelService = travelService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    MainTravelServiceDTO saveTravel(@Valid @RequestBody MainTravelServiceDTO serviceDTO, Errors errors){
        System.out.println(serviceDTO);
        return travelService.saveService(serviceDTO);
    }
    @GetMapping(value = "/{travel_id}")
    ResponseEntity<MainTravelServiceDTO> getTravel(@Valid @PathVariable String travel_id){
        MainTravelServiceDTO serviceDTO=travelService.getSelectService(travel_id);

        return new ResponseEntity<>(serviceDTO,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{travel_id}")
    void deleteTravel(@Valid @PathVariable String travel_id){
    travelService.deleteService(travel_id);
    }
    @PatchMapping(value = "/{travel_id}")
    void updateTravel(@Valid @PathVariable String travel_id,@RequestBody MainTravelServiceDTO serviceDTO){
        travelService.updateService(travel_id,serviceDTO);

    }
    @GetMapping
    public ResponseEntity<List<MainTravelServiceDTO>> getAllGuide() {
        List<MainTravelServiceDTO> dto = travelService.getAllMainTravel();
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
