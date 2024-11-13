package com.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo1.exception.InvoiceNotFoundException;
import com.demo1.model.Invoice;
import com.demo1.repository.InvoiceRepository;

@Service
public class InvoiceService implements InvoiceServiceInterface{
	
	@Autowired
	InvoiceRepository repo;

	@Override
	public Invoice saveInvoice(Invoice invoice) {
		return repo.save(invoice);
	}

	@Override
	public List<Invoice> getAllInvoice() {
		return repo.findAll();
	}

	@Override
	public String deleteInvoiceById(Long id) {
		repo.delete(getInvoiceById(id));
		return "deleted successfully!";
	}

	@Override
	public Invoice getInvoiceById(Long id) {
		Optional<Invoice> opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new InvoiceNotFoundException("Invoice not found with ID "+id);
		}
	}

	@Override
	public String updateInvoiceById(Long id, Invoice invoice) {
       Optional<Invoice> inv=repo.findById(id);
       if(inv.isPresent()) {
           Invoice updatedInvoice=inv.get();

    	   updatedInvoice.setName(invoice.getName());
    	   updatedInvoice.setLocation(invoice.getLocation());
    	   updatedInvoice.setAmount(invoice.getAmount());
    	   
    	   repo.save(updatedInvoice);
    	   return "updated successfully";

       }
	return "Invoice not found";
	}

	
}
