package com.housingporto.housingporto.controller;

import com.housingporto.housingporto.dto.PropertyInfoDTO;
import com.housingporto.housingporto.service.PropertyInfoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class PropertyInfoController {

    @Autowired
    private PropertyInfoService propertyInfoService;

    @PostMapping("/propertyinfo")
    public ResponseEntity<PropertyInfoDTO> saveProperty(@RequestBody PropertyInfoDTO propertyInfoDTO){
        propertyInfoDTO = propertyInfoService.saveProperty(propertyInfoDTO);

        ResponseEntity<PropertyInfoDTO> responseEntity = new ResponseEntity<>(propertyInfoDTO, HttpStatus.CREATED);
        return responseEntity;
    }

}
