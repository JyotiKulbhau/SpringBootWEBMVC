package com.crud;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component	
public class StreamApiDemo {

	public static void main(String[] args) {
		/*
		 * List<Product> list = new ArrayList<Product>(); list.add(new Product(10,
		 * "Mobile", 2000.90)); list.add(new Product(11, "TV", 30000.00)); list.add(new
		 * Product(12, "AC", 673434)); list.add(new Product(13, "TTT", 59594));
		 * 
		 * List<Double> productPriceList = list.stream().filter(p -> p.getPrice() >
		 * 30000).map(Product::getPrice) .collect(Collectors.toList());
		 * 
		 * System.out.println("list =="+list);	
		 * System.out.println("productPriceList =="+productPriceList);
		 */
	}
	
	@Scheduled(cron="10 * * * * *")	
	public void testSchedule() {
		System.out.println("testSchedule cron execution "+ new Date());
	}
}

 @Component	
 class Product {
	private int id;
	private String name;
	private double price;

	public Product() {
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
