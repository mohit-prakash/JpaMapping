package com.mps.JpaMapping.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    @OneToMany(mappedBy = "person",fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT) // without this we got, cannot simultaneously fetch multiple bags exception
    //another possible solution is use set instead of list
    private List<Laptop> laptops;
    @ManyToMany(mappedBy = "persons",fetch = FetchType.EAGER)
    private List<Skill> skills;
}
