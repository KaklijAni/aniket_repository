package CrudPractice.CrudCollegeMgmt.service;

import java.util.List;

import CrudPractice.CrudCollegeMgmt.entity.College;

public interface CollegeService {

	public College addCollegeDetails(College college);
	public College getCollegeDetails(int collegeID);
	public College updateCollegeDetails(int collegeID, College college);
	public void deleteCollegeDetails(int collegeID);
	List<College> getAllCollegeDetails();
}
