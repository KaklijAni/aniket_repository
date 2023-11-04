package CrudPractice.CrudCollegeMgmt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "DapartmentDetails")
public class Department {
	
		@Id
		public int deptID;

		public String name;

		public String address;

		public int rollNumber;

		public int getDeptID() {
			return deptID;
		}

		public void setDeptID(int deptID) {
			this.deptID = deptID;
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

		public int getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}

		@Override
		public String toString() {
			return "Department [deptID=" + deptID + ", name=" + name + ", address=" + address + ", rollNumber=" + rollNumber
					+ "]";
		}
	}



