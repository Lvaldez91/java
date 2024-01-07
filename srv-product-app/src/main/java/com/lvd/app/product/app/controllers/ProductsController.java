package com.lvd.app.product.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lvd.app.product.app.models.entity.Product;
import com.lvd.app.product.app.models.service.IproductService;

//El microservicio utiliza siempre REST
@RestController
public class ProductsController {
	@Autowired
	private IproductService productService;
	
	@GetMapping("/listProducts")
	public List<Product> listProduct(){
		return productService.findAll();
	}

	@GetMapping("/product/{id}")
	public Product details(@PathVariable Long id) {
		return productService.findById(id);
	}
}
