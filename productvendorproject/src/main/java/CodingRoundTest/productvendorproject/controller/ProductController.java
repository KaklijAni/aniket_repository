package CodingRoundTest.productvendorproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import CodingRoundTest.productvendorproject.entity.Products;
import CodingRoundTest.productvendorproject.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;

	@PostMapping("/productDetails")
	public ResponseEntity<Products> addProduct(@RequestBody Products product) {
		Products addProducts = productservice.addproduct(product);
		return new ResponseEntity<Products>(addProducts, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int productId) {
		productservice.deleteProduct(productId);
		return new ResponseEntity<>("product is deleted", HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Products> getProduct(@PathVariable("id") int productId) {
		Products getproduct = productservice.getProduct(productId);
		return new ResponseEntity<Products>(getproduct, HttpStatus.OK);
	}

	@PutMapping("/updateproduct/{id}")
	public ResponseEntity<Products> updateCollegeDetails(@PathVariable("id") int productId,
			@RequestBody Products product) {
		System.out.println("Recieved input ==> " + productId + " And " + product);
		product.setProductId(productId);
		Products updatedProduct = productservice.updateProduct(productId, product);
		return new ResponseEntity<>(updatedProduct, HttpStatus.OK);

	}
}
