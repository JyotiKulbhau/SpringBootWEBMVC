package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;

	@GetMapping(value="/products")
	public List<Product> getProducts(){
		
		List<Product> listOfProduct=productService.findAll();
		return listOfProduct;
		
	}
	
	@PostMapping(value="/addProduct")
	public String addProduct(@RequestParam int id,@RequestParam String name,@RequestParam String batchNo,
			@RequestParam double price,@RequestParam int noOfProd) {
		
		String res=productService.addProduct(id,name,batchNo,price,noOfProd);
        return res;
	}
	
	@PutMapping(value="/modifyProduct")
	public String updateProduct() {
		return "updated successfully";
		
	}
	
}
