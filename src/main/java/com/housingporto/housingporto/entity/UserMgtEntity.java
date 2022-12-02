package com.housingporto.housingporto.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER_MANAGEMENT_TABLE")
@Getter
@Setter
@NoArgsConstructor

public class UserMgtEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "SURNAME",nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String birthdate;
    private String occupation;
    @Column(nullable = false)
    private String salary;
    private String address;
    private Boolean marriage;


}
