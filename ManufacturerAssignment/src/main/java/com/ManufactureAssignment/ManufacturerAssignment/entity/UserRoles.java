package com.ManufactureAssignment.ManufacturerAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class UserRoles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
	public String roleValue;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRoleValue() {
		return roleValue;
	}
	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}
	
	@Override
	public String toString() {
		return "UserRoles [userId=" + userId + ", roleValue=" + roleValue + "]";
	}
	
	
}
