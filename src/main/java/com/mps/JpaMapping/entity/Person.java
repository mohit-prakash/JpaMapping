package com.mps.JpaMapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="person_tab")
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private PersonName personName;
    private Integer personAge;
    private String personMobileNo;
    @OneToOne(mappedBy = "person")
    private Aadhar aadhar;
}
