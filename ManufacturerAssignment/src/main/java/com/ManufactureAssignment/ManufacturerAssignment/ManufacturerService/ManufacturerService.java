package com.ManufactureAssignment.ManufacturerAssignment.ManufacturerService;

import java.util.List;

import com.ManufactureAssignment.ManufacturerAssignment.entity.Manufacturer;

public interface ManufacturerService {
	Manufacturer createManufacturer(Manufacturer manufacturer);
    Manufacturer updateManufacturer(Long id, Manufacturer manufacturer);
    Manufacturer getManufacturerById(Long id);
    List<Manufacturer> getAllManufacturers();
    void deleteManufacturer(Long id);
}
