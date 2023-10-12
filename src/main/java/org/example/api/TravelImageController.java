package org.example.api;

import jakarta.validation.Valid;
import org.example.dto.TravelImageDTO;
import org.example.service.TravelImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/travelImage")
public class TravelImageController {
    private final TravelImageService imageService;

    public TravelImageController(TravelImageService imageService) {
        this.imageService = imageService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json",produces = "application/json")
    TravelImageDTO saveImage(@Valid @RequestBody TravelImageDTO imageDTO, Errors errors){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TravelImageDTO> getVehicle(@Valid @PathVariable String image_id){
        return null;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping()
    void deleteImage(@Valid @PathVariable String image_id,@RequestBody TravelImageDTO imageDTO,Errors errors){

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping()
    void updateImage(@Valid @PathVariable String image_id,@RequestBody TravelImageDTO imageDTO,Errors errors){

    }
}
