package org.example.api;

import jakarta.validation.Valid;
import org.example.dto.TravelImageDTO;
import org.example.service.TravelImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@RequestMapping("/api/v1/travelImage")
public class TravelAreaImageController {
    private final TravelImageService imageService;

    public TravelAreaImageController(TravelImageService imageService) {
        this.imageService = imageService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/{area_id}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveImage(
           @RequestPart byte[] image1,
           @RequestPart byte[] image2,
           @RequestPart byte[] image3,

           @PathVariable String area_id){
        String a_image= Base64.getEncoder().encodeToString(image1);
        String b_image= Base64.getEncoder().encodeToString(image2);
        String c_image= Base64.getEncoder().encodeToString(image3);

        TravelImageDTO travelImageDTO=new TravelImageDTO();
        travelImageDTO.setImage1(a_image);
        travelImageDTO.setImage2(b_image);
        travelImageDTO.setImage3(c_image);

        return imageService.saveImage(area_id,travelImageDTO).getImage_id();
    }
    @GetMapping(value = "/{image_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TravelImageDTO> getImage(@Valid @PathVariable String image_id){
        TravelImageDTO travelImageDTO=imageService.getSelectImage(image_id);
        return new ResponseEntity<>(travelImageDTO,HttpStatus.OK);
    }

    @DeleteMapping(value = "/{image_id}")
    void deleteImage(@Valid @PathVariable String image_id){
        imageService.deleteImage(image_id);
    }

    @PatchMapping(value = "/{image_id}")
    public String updateImage(
            @Valid @PathVariable String image_id,
            @RequestPart byte[] image1,
            @RequestPart byte[] image2,
            @RequestPart byte[] image3
            ){
        String a_image= Base64.getEncoder().encodeToString(image1);
        String b_image= Base64.getEncoder().encodeToString(image2);
        String c_image= Base64.getEncoder().encodeToString(image3);

        TravelImageDTO travelImageDTO=new TravelImageDTO();
        travelImageDTO.setImage1(a_image);
        travelImageDTO.setImage2(b_image);
        travelImageDTO.setImage3(c_image);

        imageService.updateImage(image_id,travelImageDTO);
        return String.valueOf(new ResponseEntity<>(HttpStatus.OK));

    }
}
