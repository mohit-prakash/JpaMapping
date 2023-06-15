package com.mps.JpaMapping.repository;

import com.mps.JpaMapping.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
