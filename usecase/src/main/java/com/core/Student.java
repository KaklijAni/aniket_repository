package com.core;

public class Student {
	public String name;
	public String address;
	public String grade;

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", grade=" + grade + "]";
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
}
