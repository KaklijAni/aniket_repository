package com.ManufactureAssignment.ManufacturerAssignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ManufactureAssignment.ManufacturerAssignment.ManufacturerController.ManufacturerController;
import com.ManufactureAssignment.ManufacturerAssignment.ManufacturerRepository.ManufacturerRepository;
import com.ManufactureAssignment.ManufacturerAssignment.entity.Manufacturer;

@SpringBootApplication
public class ManufacturerAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManufacturerAssignmentApplication.class, args);
		System.out.println("done");
		
	}

	

}
