package com.ManufactureAssignment.ManufacturerAssignment.ManufacturerController;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ManufactureAssignment.ManufacturerAssignment.ManufacturerRepository.ManufacturerRepository;
import com.ManufactureAssignment.ManufacturerAssignment.ManufacturerService.ManufacturerService;
import com.ManufactureAssignment.ManufacturerAssignment.entity.Manufacturer;
import com.ManufactureAssignment.ManufacturerAssignment.entity.UserRoles;
import com.mysql.cj.log.Log;

@RestController
@RequestMapping("/users")
public class ManufacturerController {

	public static Logger log= LogManager.getLogger(ManufacturerController.class);
	
	
	
	@Autowired
	private ManufacturerService manufacturerService;

	@PostMapping("/manufacturer")
	public ResponseEntity<Manufacturer> createManufacturer(@RequestBody Manufacturer manufacturer) {
		
			log.info("THIS IS INFO METHOD FOR ENTERING THE MANUFACTURE");
		Manufacturer savedManufacturer = manufacturerService.createManufacturer(manufacturer);
		return new ResponseEntity<>(savedManufacturer, HttpStatus.OK);
		

	}
	
	
	@GetMapping("/getallmanufacturer")
	public ResponseEntity<List<Manufacturer>>  getAllManufacturer()
	{
		log.info("THIS IS INFO METHOD OF GETALLMANUFACTURER");
		List<Manufacturer> allManufacturer= manufacturerService.getAllManufacturers();
		return new ResponseEntity<>(allManufacturer, HttpStatus.OK);	
	}
	
	//@PreAuthorize("hasRole('Admin')")
	@GetMapping("/getManufacturerById/{id}")
	public ResponseEntity<Manufacturer> getManufacturerById(@PathVariable("id") Long manufacturerId)
	{
		log.trace("THIS IS TRACE METHOD");
		log.info("THIS IS INFO METHOD"); 
		Manufacturer manufacturerById= manufacturerService.getManufacturerById(manufacturerId);
		return new ResponseEntity<>(manufacturerById, HttpStatus.OK);
	}
	@PutMapping("/manufacturerupdate/{id}")
    public ResponseEntity<Manufacturer> updateManufacturer(@PathVariable("id") Long manufacturerId,
                                           @RequestBody Manufacturer manufacturer){
		
		manufacturer.setManufacturerId(manufacturerId);
		Manufacturer updatedmanufacturer= manufacturerService.updateManufacturer(manufacturerId, manufacturer);
        return new ResponseEntity<>(updatedmanufacturer, HttpStatus.OK);
		
    }
	
	@DeleteMapping("/manufacturer/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long manufacturerId ){
		manufacturerService.deleteManufacturer(manufacturerId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
	
	
}