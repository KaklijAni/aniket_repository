package com.ManufactureAssignment.ManufacturerAssignment.ManufacturerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ManufactureAssignment.ManufacturerAssignment.entity.Manufacturer;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{

}
