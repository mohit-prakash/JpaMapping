package com.mps.JpaMapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Aadhar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aadharId;
    private String aadharNo;
    @OneToOne
    private Person person;
}
