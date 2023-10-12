package org.example.util;

import org.example.dto.MainTravelServiceDTO;
import org.example.dto.PackageDTO;
import org.example.dto.TravelAreaDTO;
import org.example.dto.TravelImageDTO;
import org.example.entity.MainTravelServiceEntity;
import org.example.entity.PackageEntity;
import org.example.entity.TravelAreaEntity;
import org.example.entity.TravelAreaImage;
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

    public TravelAreaEntity  toAreaEntity(TravelAreaDTO areaDTO){
        return modelMapper.map(areaDTO, TravelAreaEntity.class);
    }

    public TravelAreaDTO toAreaDto(TravelAreaEntity travelAreaEntity){
        return modelMapper.map(travelAreaEntity, TravelAreaDTO.class);
    }

    public TravelAreaImage toImageEntity(TravelImageDTO  imageDTO){
        return modelMapper.map(imageDTO, TravelAreaImage.class);
    }

    public TravelImageDTO toImageDto(TravelAreaImage travelAreaImage){
        return modelMapper.map(travelAreaImage, TravelImageDTO.class);
    }

    public PackageEntity toPackageEntity(PackageDTO packageDTO){
        return modelMapper.map(packageDTO, PackageEntity.class);
    }

    public PackageDTO toPackageDto(PackageEntity packageEntity){
        return modelMapper.map(packageEntity, PackageDTO.class);
    }
}
