package com.hcl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.model.Product;

public interface ProductDAO extends JpaRepository<Product, Long> {
	
	

}
