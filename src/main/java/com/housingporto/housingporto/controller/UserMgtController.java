package com.housingporto.housingporto.controller;

import com.housingporto.housingporto.dto.UserMgtDTO;
import com.housingporto.housingporto.service.UserMgtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserMgtController {

    @Autowired
    private UserMgtService userMgtService;

    @PostMapping("/user")
    public ResponseEntity<UserMgtDTO> saveUser(@RequestBody UserMgtDTO userMgtDTO){
        userMgtDTO = userMgtService.saveUser(userMgtDTO);

        ResponseEntity<UserMgtDTO> responseEntity = new ResponseEntity<>(userMgtDTO, HttpStatus.CREATED);
        return responseEntity;
    }

}
