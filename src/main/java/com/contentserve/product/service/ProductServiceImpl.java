package com.contentserve.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contentserve.product.dao.ProductRepository;
import com.contentserve.product.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;


	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAll() {
		return (List<Product>) productRepository.findAll() ;
		
	}


	@Override
	public Product get(Long id) {
		return  productRepository.findById(id).get();
	}


	@Override
	public void delete(Long id) {
		if(productRepository.existsById(id)) {
		         productRepository.deleteById(id);
		}
	}

	@Override
	public List<Product> getProductByCategoryName(String productCategory) {
		return productRepository.findByProductCategoryName(productCategory);
	}

	@Override
	public List<Product> getProductBySubCategoryName(String productSubCategory) {
		return productRepository.findByProductSubCategoryName(productSubCategory);
	}

}
