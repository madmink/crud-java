package com.housingporto.housingporto.service.impl;

import com.housingporto.housingporto.converter.PropertyInfoConverter;
import com.housingporto.housingporto.dto.PropertyInfoDTO;
import com.housingporto.housingporto.entity.PropertyInfoEntity;
import com.housingporto.housingporto.repository.PropertyInfoRepository;
import com.housingporto.housingporto.service.PropertyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyInfoServiceImpl implements PropertyInfoService {
    @Autowired
    private PropertyInfoRepository propertyInfoRepository;

    @Autowired
    private PropertyInfoConverter propertyInfoConverter;

    @Override
    public PropertyInfoDTO saveProperty (PropertyInfoDTO propertyInfoDTO){
        PropertyInfoEntity pie = propertyInfoConverter.convertDTOtoEntity(propertyInfoDTO);
        pie = propertyInfoRepository.save(pie);

        propertyInfoDTO = propertyInfoConverter.convertEntitytoDTO(pie);
        return propertyInfoDTO;
    }

}
