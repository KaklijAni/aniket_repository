package CrudPractice.CrudCollegeMgmt.collegeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import CrudPractice.CrudCollegeMgmt.entity.College;
import CrudPractice.CrudCollegeMgmt.service.CollegeService;

@RestController
//@RequestMapping("/College")
public class CollegeController {

	@Autowired
	private CollegeService collegeService;

	@PostMapping("/addcollegedetails")
	public ResponseEntity<College> AddCollegeDetails(@RequestBody College college) {
		College saveCollege = collegeService.addCollegeDetails(college);
		return new ResponseEntity<College>(saveCollege, HttpStatus.OK);
	}

	@GetMapping("/{Id}")
	public ResponseEntity<College> getCollegeDetails(@PathVariable("Id") int collegeID) {
		College getCollege = collegeService.getCollegeDetails(collegeID);
		return new ResponseEntity<College>(getCollege, HttpStatus.FOUND);
	}

	@GetMapping("/getallcolleges")
	public ResponseEntity<List<College>> getAllCollegeDetails(@RequestBody College college) {
		List<College> getallcolleges = collegeService.getAllCollegeDetails();
		return new ResponseEntity<List<College>>(getallcolleges, HttpStatus.OK);
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int collegeID) {
		collegeService.deleteCollegeDetails(collegeID);
		return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	}

	/**
	 * 
	 * @param collegeID
	 * @param college
	 * @return
	 */
	@PutMapping("/updatecollege/{id}")
	public ResponseEntity<College> updateCollegeDetails(@PathVariable("id") int collegeID,
			@RequestBody College college) {
		System.out.println("Recieved input ==> " + collegeID + " And " + college);
		college.setCollegeID(collegeID);
		College updatedcollege = collegeService.updateCollegeDetails(collegeID, college);
		return new ResponseEntity<>(updatedcollege, HttpStatus.OK);

	}
}
