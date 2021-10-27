package com.nishant.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishant.spring.springorm.product.dao.ProductDao;
import com.nishant.spring.springorm.product.model.Product;

public class test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nishant/spring/springorm/product/test/config.xml");
		ProductDao dao = (ProductDao) ctx.getBean("productDao");
		Product product = new Product();
		/*
		product.setId(1);
		product.setName("iphone");
		product.setDesc("wonderfull");
		product.setPrice(800);
		dao.create(product);
		dao.update(product);
		dao.delete(product);
		Product find = dao.find(2);
		*/
		
		List<Product> findAll = dao.findAll();
		System.out.println(findAll);
	}

}
