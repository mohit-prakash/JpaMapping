package com.mps.JpaMapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class PersonName {
    private String firstName;
    private String middleName;
    private String lastName;
}
