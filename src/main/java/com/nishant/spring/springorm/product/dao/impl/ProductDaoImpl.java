package com.nishant.spring.springorm.product.dao.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.nishant.spring.springorm.product.dao.ProductDao;
import com.nishant.spring.springorm.product.model.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);

	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);

	}

	@Override
	@Transactional
	public Product find(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> product = hibernateTemplate.loadAll(Product.class);
		return product;
	}

}
