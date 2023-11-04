package CrudPractice.CrudCollegeMgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collegeDetails")
public class College {

	@Id
	public int collegeID;

	public String name;

	public String address;

	public String grade;

	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "College [collegeID=" + collegeID + ", name=" + name + ", address=" + address + ", grade=" + grade + "]";
	}
}



