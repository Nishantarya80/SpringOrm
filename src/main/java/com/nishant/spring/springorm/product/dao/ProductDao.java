package com.nishant.spring.springorm.product.dao;

import java.util.List;

import com.nishant.spring.springorm.product.model.Product;


public interface ProductDao {

	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product find(int id);
	
	List<Product> findAll();

}
