package org.example.service.util;

import lombok.RequiredArgsConstructor;
import org.example.dto.TravelImageDTO;
import org.example.entity.TravelAreaEntity;
import org.example.entity.TravelAreaImage;
import org.example.exception.NotFoundException;
import org.example.repo.TravelAreaRepo;
import org.example.repo.TravelImageRepo;
import org.example.service.TravelImageService;
import org.example.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
@Transactional
@RequiredArgsConstructor
public class TravelImageServiceIMPL implements TravelImageService {

private final Converter converter;

private final TravelImageRepo travelImageRepo;
private final TravelAreaRepo travelAreaRepo;

    @Override
    public TravelImageDTO saveImage(String area_id,TravelImageDTO imageDTO) {
        TravelAreaEntity travelAreaEntity = travelAreaRepo.findById(area_id).orElseThrow();
        TravelAreaImage imageEntity = converter.toImageEntity(imageDTO);
        imageEntity.setTravelAreaEntity(travelAreaEntity);
        TravelImageDTO travelImageDTO = converter.toImageDto(travelImageRepo.save(imageEntity));
        System.out.println(travelImageDTO);
        return travelImageDTO;
    }

    @Override
    public TravelImageDTO getSelectImage(String image_id) {
        TravelAreaImage travelAreaImage = travelImageRepo.findById(image_id).orElseThrow(()->new NotFoundException("The Image Id Not Fount :"+image_id));
        TravelImageDTO travelImageDTO= converter.toImageDto(travelAreaImage);
        travelImageDTO.setTravel_area_id(travelAreaImage.getTravelAreaEntity().getId());
        return travelImageDTO;

    }

    @Override
    public void updateImage(String image_id,TravelImageDTO imageDTO) {
        Optional<TravelAreaImage> byId = travelImageRepo.findById(image_id);
        if (!byId.isPresent()){
            throw new NotFoundException("The Image Id Not Found :"+image_id);
//            byId.get().setImage1(imageDTO.getImage1());
//            byId.get().setImage2(imageDTO.getImage2());
//            byId.get().setImage3(imageDTO.getImage3());
        }
        TravelAreaImage travelAreaImage=byId.get();
        travelAreaImage.setImage1(imageDTO.getImage1());
        travelAreaImage.setImage2(imageDTO.getImage2());
        travelAreaImage.setImage3(imageDTO.getImage3());
         travelImageRepo.save(travelAreaImage);
    }

    @Override
    public void deleteImage(String image_id) {
        Optional<TravelAreaImage> byId = travelImageRepo.findById(image_id);
        if (!byId.isPresent()){
            throw new NotFoundException("The Image Id Not Found :"+image_id);
        }
        travelImageRepo.deleteById(image_id);
    }
}
