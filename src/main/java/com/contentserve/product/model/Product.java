package com.contentserve.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "productdetails")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	@NotNull
	private String retailerName;
	private String retailerId;
	@Column(length=12)
	private String productBarCode;
	@Size(min=2,max=20)
	private String productName;
	@Size(min=2,max=20)
	private String productManufacturerName;
	@Size(min=20,max=200)
	private String productDescription;
	private String productCategoryName;
	private String productSubCategoryName;

	private double retailPrice;
	private double wholeSalePrice;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getProductBarCode() {
		return productBarCode;
	}

	public void setProductBarCode(String productBarCode) {
		this.productBarCode = productBarCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductManufacturerName() {
		return productManufacturerName;
	}

	public void setProductManufacturerName(String productManufacturerName) {
		this.productManufacturerName = productManufacturerName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public String getProductSubCategoryName() {
		return productSubCategoryName;
	}

	public void setProductSubCategoryName(String productSubCategoryName) {
		this.productSubCategoryName = productSubCategoryName;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public double getWholeSalePrice() {
		return wholeSalePrice;
	}

	public void setWholeSalePrice(double wholeSalePrice) {
		this.wholeSalePrice = wholeSalePrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", retailerName=" + retailerName + ", retailerId=" + retailerId
				+ ", productBarCode=" + productBarCode + ", productName=" + productName + ", productManufacturerName="
				+ productManufacturerName + ", productDescription=" + productDescription + ", productCategoryName="
				+ productCategoryName + ", productSubCategoryName=" + productSubCategoryName + ", retailPrice="
				+ retailPrice + ", wholeSalePrice=" + wholeSalePrice + "]";
	}

	
}
