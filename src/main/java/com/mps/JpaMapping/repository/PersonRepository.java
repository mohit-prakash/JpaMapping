package com.mps.JpaMapping.repository;

import com.mps.JpaMapping.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
