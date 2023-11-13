package CodingRoundTest.productvendorproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="products")
public class Products {

	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int productId;
	
	@Column(name="name")
	public String productName;
	
	@Column(name="vendor_id")
	public int vendorId;
	public double price;
	public String status;
	
	@Column(name="created_at")
	public String createdAt;
	
	@Column(name="product-image")
	public String productImage;

	
	
	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getVendorId() {
		return vendorId;
	}



	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}



	public String getProductImage() {
		return productImage;
	}



	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}



	public List<OrderItems> getOrderList() {
		return orderList;
	}



	public void setOrderList(List<OrderItems> orderList) {
		this.orderList = orderList;
	}



	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductId", referencedColumnName = "product_id")
	public List<OrderItems> orderList= new ArrayList<>();
	
}
