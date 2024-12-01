package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	private String productMaster;
	private String productName;
	private double price;
	private String description;
	private double rate;
	private String review;
    @Id
    private Long id;

	public String getProductMaster() {
		return productMaster;
	}
	public void setProductMaster(String productMaster) {
		this.productMaster = productMaster;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double d) {
		this.rate = d;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
