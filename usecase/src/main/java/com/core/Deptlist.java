package com.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deptlist {
	private String name;
    private String address;
    
    public List<Student> studentList;
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "Deptlist [name=" + name + ", address=" + address + ", studentList=" + studentList + "]";
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

    
}
