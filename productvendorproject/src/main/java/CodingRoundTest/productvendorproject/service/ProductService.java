package CodingRoundTest.productvendorproject.service;

import CodingRoundTest.productvendorproject.entity.Products;

public interface ProductService {

	
	public Products addproduct(Products product);
	public void deleteProduct(int productId);
	public Products getProduct(int productId);
	public Products updateProduct(int productId, Products product);
}
