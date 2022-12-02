package com.housingporto.housingporto.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserMgtDTO {

    private Long id;
    private String name;
    private String email;
    private String birthdate;
    private String occupation;
    private String salary;
    private String address;
    private Boolean marriage;


}
