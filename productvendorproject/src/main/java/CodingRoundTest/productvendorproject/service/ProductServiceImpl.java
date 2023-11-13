package CodingRoundTest.productvendorproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CodingRoundTest.productvendorproject.entity.Products;
import CodingRoundTest.productvendorproject.entity.VendorDetails;
import CodingRoundTest.productvendorproject.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrepository;

	@Override
	public Products addproduct(Products product) {
		VendorDetails v1=new VendorDetails();
     return productrepository.save(product);
	}

	@Override
	public void  deleteProduct(int productId) {
		productrepository.deleteById(productId);	
	}

	@Override
	public Products getProduct(int productId) {
		Optional<Products> getProduct= productrepository.findById(productId);
		return getProduct(productId);
	}

	@Override
	public Products updateProduct(int productId, Products product) {
		Products existingProdObj= productrepository.findById(productId).get();
	existingProdObj.setProductId(product.getProductId());
	existingProdObj.setPrice(product.getPrice());
	existingProdObj.setCreatedAt(product.getCreatedAt());
	existingProdObj.setProductName(product.getProductName());
	existingProdObj.setOrderList(product.getOrderList());
	existingProdObj.setStatus(product.getStatus());
	existingProdObj.setVendorId(product.getVendorId());
	existingProdObj.setProductImage(product.getProductImage());
	
	Products updatedProducts=productrepository.save(existingProdObj);
		return updatedProducts;
	}

}
