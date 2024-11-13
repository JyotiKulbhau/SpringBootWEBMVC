package com.demo1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo1.model.Invoice;
import com.demo1.service.InvoiceService;

//@RestController
//@RequestMapping("/invoice")
public class HomeContoller {

	@Autowired
	InvoiceService service;
	
	@PostMapping("/saveInvoice")
	public String addInvoice(@RequestBody Invoice invoice) {
		Optional<Invoice> in=Optional.of(service.saveInvoice(invoice));
		if(!in.isEmpty()) {
			return "Invoice added.";
		}
		return null;
	}
	
	@GetMapping("/getAllInvoices")
	public List<Invoice> getAllInvoice() {
		return service.getAllInvoice();
	}
	
	@GetMapping("/getInvoiceById")
	public Invoice getInvoiceById(@RequestParam Long id) {
		return service.getInvoiceById(id);
	}
	
	@DeleteMapping("/deleteById")
	public String deleteInvoiceById(@RequestParam Long id) {
		return service.deleteInvoiceById(id);
	}
	
	@PutMapping("/updateInvoice/{id}")
	public String updateInvoice(@PathVariable Long id,@RequestBody Invoice invoice) {
		return service.updateInvoiceById(id, invoice);
	}
	
	
}
