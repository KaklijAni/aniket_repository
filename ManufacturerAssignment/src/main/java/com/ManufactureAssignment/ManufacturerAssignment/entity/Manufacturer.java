package com.ManufactureAssignment.ManufacturerAssignment.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Manufacturer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long manufacturerId;

    private String name;
    private String description;
    private String enable;
    private String website;
   // public UserRoles userRoles;
    @OneToMany(cascade = CascadeType.ALL)//wherever we save the post entity into the database, so all the product will be saved onto db.
    @JoinColumn(name = "MP_Fid",referencedColumnName = "manufacturerId")
    private List<Product> product= new ArrayList<Product>();
	
    
   
    @Override
	public String toString() {
		return "Manufacturer [manufacturerId=" + manufacturerId + ", name=" + name + ", description=" + description
				+ ", enable=" + enable + ", website=" + website + ", product=" + product + "]";
	}
	public Manufacturer(Long manufacturerId, String name, String description, String enable, String website,
		List<Product> product) {
	super();
	this.manufacturerId = manufacturerId;
	this.name = name;
	this.description = description;
	this.enable = enable;
	this.website = website;
	this.product = product;
}
	public Long getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

}
