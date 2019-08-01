package com.javabrains.model;

public class Product {
	private String name;
	private String sku;
	private double price;
	
	public Product(String name, String sku, double price) {
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public String getSku() {
		return sku;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		

}
