package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductService;
@Service
public class ProductService  implements IProductService{
	ArrayList<Product> products=new ArrayList<Product>();
	Product product;
	
	public ProductService() {
		product=new Product();
	}

	@Override
	public List<Product> findAll() {
		
		products.add(new Product(101,"EarPhones","EAR101",2000,5));
		products.add(new Product(100, "Mobile", "MOB100", 9000.00, 6));  
		products.add(new Product(102,"TV","TV102",20000.00,100));
		products.add(new Product(103,"EBUD103","EarBuds",3500.00,50));
		return products;
	}
	
	public List<Product> modifyProduct(int id){
		
		return products;
		
	}
	@Override
	public String addProduct(int id,String name,String batchNo,double price,int noOfProd) {
		
		products.add(new Product(id,name,batchNo,price,noOfProd));
		return "Product added";
	}

}
