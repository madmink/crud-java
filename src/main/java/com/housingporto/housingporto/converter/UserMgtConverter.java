package com.housingporto.housingporto.converter;

import com.housingporto.housingporto.dto.UserMgtDTO;
import com.housingporto.housingporto.entity.UserMgtEntity;
import org.springframework.stereotype.Component;

@Component //check usage component ke documentation
public class UserMgtConverter {
    public UserMgtEntity convertDTOtoEntity(UserMgtDTO userMgtDTO){
        UserMgtEntity ue = new UserMgtEntity();
        ue.setName(userMgtDTO.getName());
        ue.setEmail(userMgtDTO.getEmail());
        ue.setBirthdate(userMgtDTO.getBirthdate());
        ue.setOccupation(userMgtDTO.getOccupation());
        ue.setSalary(userMgtDTO.getSalary());
        ue.setAddress(userMgtDTO.getAddress());
        ue.setMarriage(userMgtDTO.getMarriage());
        return ue;
    }

    public UserMgtDTO convertEntityToDTO(UserMgtEntity userMgtEntity){
        UserMgtDTO userMgtDTO = new UserMgtDTO();
        userMgtDTO.setId(userMgtEntity.getId());
        userMgtDTO.setName(userMgtEntity.getName());
        userMgtDTO.setEmail(userMgtEntity.getName());
        userMgtDTO.setBirthdate(userMgtEntity.getBirthdate());
        userMgtDTO.setOccupation(userMgtEntity.getOccupation());
        userMgtDTO.setSalary(userMgtEntity.getSalary());
        userMgtDTO.setAddress(userMgtEntity.getAddress());
        userMgtDTO.setMarriage(userMgtEntity.getMarriage());

        return userMgtDTO;
    }

}



