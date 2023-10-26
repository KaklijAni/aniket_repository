package com.ManufactureAssignment.ManufacturerAssignment.ManufacturerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManufactureAssignment.ManufacturerAssignment.ManufacturerRepository.ManufacturerRepository;
import com.ManufactureAssignment.ManufacturerAssignment.entity.Manufacturer;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

	Logger logger=org.apache.logging.log4j.LogManager.getLogger(ManufacturerServiceImpl.class);
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	
	@Override
	public Manufacturer createManufacturer(Manufacturer manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}

	@Override
	public Manufacturer updateManufacturer(Long manufacturerId, Manufacturer manufacturer) {
		Manufacturer existingManufacturer = manufacturerRepository.findById(manufacturer.getManufacturerId()).get();
		existingManufacturer.setName(manufacturer.getName());
		existingManufacturer.setDescription(manufacturer.getDescription());
		existingManufacturer.setEnable(manufacturer.getEnable());
		existingManufacturer.setWebsite(manufacturer.getWebsite());
		Manufacturer updatedExistingManufacturer= manufacturerRepository.save(manufacturer);
        return updatedExistingManufacturer;
		
	}
	

	@Override
	public List<Manufacturer> getAllManufacturers() {
		List<Manufacturer> manufacturerlist=new ArrayList<Manufacturer>();
		try
		{
			logger.info("this service level getallmanufacturer method started");
			 manufacturerlist= manufacturerRepository.findAll();
		
		logger.info("this service level getallmanufacturer method ended");
		}catch (Exception e) 
		{
			logger.error("exception in getallemployee");
			e.printStackTrace();
		}
		return manufacturerlist;
	}

	@Override
	public void deleteManufacturer(Long manufacturerId) {
		manufacturerRepository.deleteById(manufacturerId);
	}

	
	@Override
	public Manufacturer getManufacturerById(Long manufacturerId) {
		Optional<Manufacturer> optionalManufacturer  = manufacturerRepository.findById(manufacturerId);
        return optionalManufacturer.get();
	}

}
