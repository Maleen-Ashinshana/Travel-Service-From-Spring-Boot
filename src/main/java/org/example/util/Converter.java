package org.example.util;

import org.example.dto.MainTravelServiceDTO;
import org.example.entity.MainTravelServiceEntity;
import org.example.entity.TravelPackage;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    private final ModelMapper modelMapper;

    public Converter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public MainTravelServiceEntity toServiceEntity(MainTravelServiceDTO serviceDTO){
        return modelMapper.map(serviceDTO, MainTravelServiceEntity.class);
    }

    public MainTravelServiceDTO toServiceDto(MainTravelServiceEntity mainTravelServiceEntity){
        return modelMapper.map(mainTravelServiceEntity, MainTravelServiceDTO.class);
    }

//    public TravelAreaEntity  toAreaEntity(TravelAreaDTO areaDTO){
//        return modelMapper.map(areaDTO, TravelAreaEntity.class);
//    }
//
//    public TravelAreaDTO toAreaDto(TravelAreaEntity travelAreaEntity){
//        return modelMapper.map(travelAreaEntity, TravelAreaDTO.class);
//    }
//
//    public TravelAreaImage toImageEntity(TravelImageDTO  imageDTO){
//        return modelMapper.map(imageDTO, TravelAreaImage.class);
//    }
//
//    public TravelImageDTO toImageDto(TravelAreaImage travelAreaImage){
//        return modelMapper.map(travelAreaImage, TravelImageDTO.class);
//    }

    public TravelPackage toPackageEntity(Package aPackage){
        return modelMapper.map(aPackage, TravelPackage.class);
    }

    public Package toPackageDto(TravelPackage packageEntity){
        return modelMapper.map(packageEntity, Package.class);
    }
}
