package com.housingporto.housingporto.service.impl;

import com.housingporto.housingporto.converter.UserMgtConverter;
import com.housingporto.housingporto.dto.UserMgtDTO;
import com.housingporto.housingporto.entity.UserMgtEntity;
import com.housingporto.housingporto.repository.UserMgtRepository;
import com.housingporto.housingporto.service.UserMgtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMgtServiceImpl implements UserMgtService {

    @Autowired
    private UserMgtRepository userMgtRepository;

    @Autowired
    private UserMgtConverter userMgtConverter;

    @Override
    public UserMgtDTO saveUser(UserMgtDTO userMgtDTO){

        UserMgtEntity ue = userMgtConverter.convertDTOtoEntity(userMgtDTO);
        ue = userMgtRepository.save(ue);

        userMgtDTO = userMgtConverter.convertEntityToDTO(ue);
        return userMgtDTO;
    }

}
