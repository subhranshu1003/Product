package com.contentserve.product.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.contentserve.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {


		public List<Product> findByProductCategoryName(String productCategory);

		public List<Product> findByProductSubCategoryName(String productSubCategory);
}


