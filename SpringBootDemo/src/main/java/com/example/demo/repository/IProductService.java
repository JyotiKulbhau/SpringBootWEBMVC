package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface IProductService {
	
	List<Product> findAll();

	String addProduct(int id, String name, String batchNo, double price, int noOfProd);  

}
