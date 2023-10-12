package org.example.service.util;

import org.example.dto.TravelImageDTO;
import org.example.entity.TravelAreaImage;
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
public class TravelImageServiceIMPL implements TravelImageService {
@Autowired
private Converter converter;
@Autowired
private TravelImageRepo travelImageRepo;

    @Override
    public TravelImageDTO saveImage(TravelImageDTO imageDTO) {
        return null;
    }

    @Override
    public TravelImageDTO getSelectImage(String image_id) {
        return null;
    }

    @Override
    public void updateImage(String image_id) {

    }

    @Override
    public void deleteImage(String image_id) {

    }
}
