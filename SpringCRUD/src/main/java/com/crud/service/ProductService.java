package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Product;
import com.crud.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	public Product getProductByProductName(String productName) {
		return productRepository.findByProductName(productName);
	}

	public String deleteProductById(int id) {
		productRepository.deleteById(id);
		return "Product Deleted Successfully by id " + id;
	}

	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setPrice(product.getPrice());
        existingProduct.setProductName(product.getProductName());
        existingProduct.setQuantity(product.getQuantity());
		return productRepository.save(existingProduct);

	}

	public Product updateProduct(int id) {
		return null;
	}

}
