package com.demo1.service;

import java.util.List;

import com.demo1.model.Invoice;

public interface InvoiceServiceInterface {
	
	public Invoice saveInvoice(Invoice invoice);
	public List<Invoice> getAllInvoice();
	public String deleteInvoiceById(Long id);
	public Invoice getInvoiceById(Long id);
	default void updateInvoiceById(Long id) {}
	public String updateInvoiceById(Long id, Invoice invoice);

}
