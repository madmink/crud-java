package com.housingporto.housingporto.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="PROPERTY_INFO_TABLE")
@Getter
@Setter
@NoArgsConstructor

public class PropertyInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdP;
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
