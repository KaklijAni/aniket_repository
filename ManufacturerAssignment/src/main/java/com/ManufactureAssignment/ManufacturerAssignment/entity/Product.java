package com.ManufactureAssignment.ManufacturerAssignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
	@Id
	private long ProductId;
	private String ProductName;
	private float ProductMRP;
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductMRP=" + ProductMRP + "]";
	}
	public long getProductId() {
		return ProductId;
	}
	public void setProductId(long productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public float getProductMRP() {
		return ProductMRP;
	}
	public void setProductMRP(float productMRP) {
		ProductMRP = productMRP;
	}
	
}
