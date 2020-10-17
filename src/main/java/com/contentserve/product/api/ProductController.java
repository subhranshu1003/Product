package com.contentserve.product.api;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

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

import com.contentserve.product.model.Product;
import com.contentserve.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/products")
	public ResponseEntity<Product> saveProduct(@Valid @RequestBody Product product) {
		Product saveProduct = productService.saveProduct(product);
		return new ResponseEntity<>(saveProduct, HttpStatus.OK);
	}

	@PutMapping("/products/{id}")
	public ResponseEntity<Product> update(@RequestBody Product product, @PathVariable Long id) {
		
		try {
	        Product existProduct = productService.get(id);
	        if(existProduct != null)
	        	productService.saveProduct(product);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.getAll();
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<Product> get(@PathVariable("id") Long id) {
		try {
			Product product = productService.get(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Long id) {
		productService.delete(id);
	}
	
	@GetMapping("/products/category/{productCategory}")
	public  List<Product> getProductByCategory(@PathVariable("productCategory") String productCategory) {
		List<Product> productList = productService.getProductByCategoryName(productCategory);
		return productList;
			
	}
	
	@GetMapping("/products/subcategory/{productSubCategory}")
	public  List<Product> getProductBySubCategory(@PathVariable("productSubCategory") String productSubCategory) {
		List<Product> productList = productService.getProductBySubCategoryName(productSubCategory);
		return productList;
			
	}
	

}
