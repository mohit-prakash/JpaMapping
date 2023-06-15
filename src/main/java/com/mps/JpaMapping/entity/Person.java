package com.mps.JpaMapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "person")
    private List<Laptop> laptops;
}
