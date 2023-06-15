package com.mps.JpaMapping.entity;

import javax.persistence.*;

@Entity
@Table(name = "laptop_tab")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lap_id")
    private Integer laptopId;
    @Column(name = "lap_brand")
    private String laptopBrand;
    @Column(name = "lap_ram")
    private String laptopRam;
    @Column(name = "lap_cpu")
    private String laptopCpu;

    @ManyToOne
    @JoinColumn(name = "person_id_fk")
    private Person person;

}
