package com.training.springwithhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springwithhibernate.dao.Product;
import com.training.springwithhibernate.dao.ProductDao;

@RestController
public class ProductController {

	@Autowired
	ProductDao dao;

	@GetMapping("/products")
	public List<Product> findAll() {
		return dao.getProduct();
	}

	@GetMapping("/product/{pid}")
	public Product FindProduct(@PathVariable Integer pid) {
		return dao.findProduct(pid);
	}

	@PostMapping("/Product")
	public String SaveProduct(@RequestBody Product p) {
		return dao.saveProduct(p);
	}
	
	@DeleteMapping("/product/{pid}")
	public String deleteProduct(@PathVariable Integer pid) {
		return dao.deleteProduct(pid);
	}

}
