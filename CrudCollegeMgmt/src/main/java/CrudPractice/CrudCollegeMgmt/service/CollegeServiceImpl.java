package CrudPractice.CrudCollegeMgmt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CrudPractice.CrudCollegeMgmt.entity.College;
import CrudPractice.CrudCollegeMgmt.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public College addCollegeDetails(College college) {
		return collegeRepository.save(college);

	}

	@Override
	public College getCollegeDetails(int collegeID) {
		Optional<College> optionalCollege = collegeRepository.findById(collegeID);
		return optionalCollege.get();

	}

	@Override
	public College updateCollegeDetails(int collegeID, College college) {
		College findCollege = collegeRepository.findById(collegeID).get();
		findCollege.setCollegeID(college.getCollegeID());
		findCollege.setName(college.getName());
		findCollege.setAddress(college.getAddress());
		findCollege.setGrade(college.getGrade());
		
		College updadedCollegeInfo=collegeRepository.save(college);
		return updadedCollegeInfo;
	}

	@Override
	public void deleteCollegeDetails(int collegeID) {
		collegeRepository.deleteById(collegeID);
	}

	@Override
	public List<College> getAllCollegeDetails() {
		List<College> collegeList = new ArrayList<College>();
		collegeList = collegeRepository.findAll();
		return collegeList;
	}

}
