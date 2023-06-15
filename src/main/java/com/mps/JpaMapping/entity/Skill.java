package com.mps.JpaMapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="skill_tab")
@Getter
@Setter
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer skillId;
    private String skill;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Person> persons;
}
