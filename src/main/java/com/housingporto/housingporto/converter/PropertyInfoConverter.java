package com.housingporto.housingporto.converter;

import com.housingporto.housingporto.dto.PropertyInfoDTO;
import com.housingporto.housingporto.entity.PropertyInfoEntity;
import org.springframework.stereotype.Component;

@Component //check ke documentation juga bean process nya kaya apa
public class PropertyInfoConverter {
    public PropertyInfoEntity convertDTOtoEntity(PropertyInfoDTO propertyInfoDTO){
        PropertyInfoEntity pie = new PropertyInfoEntity();
        pie.setPropertyname(propertyInfoDTO.getPropertyname());
        pie.setPropertydescription(propertyInfoDTO.getPropertydescription());
        pie.setPropertyprice(propertyInfoDTO.getPropertyprice());
        pie.setWideestate(propertyInfoDTO.getWideestate());
        pie.setWideproperty(propertyInfoDTO.getWideproperty());
        pie.setTotalbedroom(propertyInfoDTO.getTotalbedroom());
        pie.setTotalrestroom(propertyInfoDTO.getTotalrestroom());
        pie.setPropertytype(propertyInfoDTO.getPropertytype());
        pie.setTotalcarport(propertyInfoDTO.getTotalcarport());
        pie.setFacility(propertyInfoDTO.getFacility());
        return pie;
    }
    public PropertyInfoDTO convertEntitytoDTO(PropertyInfoEntity propertyInfoEntity){
        PropertyInfoDTO propertyInfoDTO = new PropertyInfoDTO();
        propertyInfoDTO.setIdP(propertyInfoEntity.getIdP());
        propertyInfoDTO.setPropertyname(propertyInfoEntity.getPropertyname());
        propertyInfoDTO.setPropertydescription(propertyInfoEntity.getPropertydescription());
        propertyInfoDTO.setPropertyprice(propertyInfoEntity.getPropertyprice());
        propertyInfoDTO.setWideestate(propertyInfoEntity.getWideestate());
        propertyInfoDTO.setWideproperty(propertyInfoEntity.getWideproperty());
        propertyInfoDTO.setTotalbedroom(propertyInfoEntity.getTotalbedroom());
        propertyInfoDTO.setTotalrestroom(propertyInfoEntity.getTotalrestroom());
        propertyInfoDTO.setPropertytype(propertyInfoEntity.getPropertytype());
        propertyInfoDTO.setTotalcarport(propertyInfoEntity.getTotalcarport());
        propertyInfoDTO.setFacility(propertyInfoEntity.getFacility());
        return propertyInfoDTO;

    }

}
