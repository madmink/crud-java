package com.housingporto.housingporto.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PropertyInfoDTO {

    private Long idP;
    private String propertyname;
    private String propertydescription;
    private Double propertyprice;
    private Integer wideestate;
    private Integer wideproperty;
    private Integer totalbedroom;
    private Integer totalrestroom;
    private String propertytype;
    private String totalcarport;
    private String facility;

}
