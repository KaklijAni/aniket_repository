package com.ManufactureAssignment.ManufacturerAssignment.ManufacturerRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManufactureAssignment.ManufacturerAssignment.entity.Product;

public interface ProductRepository  extends JpaRepository<Product,Long>{

}
