package com.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo1.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Long>{

}
