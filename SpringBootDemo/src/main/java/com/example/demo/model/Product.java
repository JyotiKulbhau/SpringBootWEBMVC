package com.example.demo.model;

public class Product {

	private int id;
	private String productName;
	private String batchNum;
	private double price;
	private int numOfProduct;

	public Product() {
	}

	public Product(int id, String productName, String batchNum, double price, int numOfProduct) {
		super();
		this.id = id;
		this.productName = productName;
		this.batchNum = batchNum;
		this.price = price;
		this.numOfProduct = numOfProduct;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumOfProduct() {
		return numOfProduct;
	}

	public void setNumOfProduct(int numOfProduct) {
		this.numOfProduct = numOfProduct;
	}

}
