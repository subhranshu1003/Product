package com.contentserve.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contentserve.product.model.Product;

@Service
public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAll();

	public Product get(Long id);

	public void delete(Long id);

	public List<Product> getProductByCategoryName(String productCategory);

	public List<Product> getProductBySubCategoryName(String productSubCategory);

}
