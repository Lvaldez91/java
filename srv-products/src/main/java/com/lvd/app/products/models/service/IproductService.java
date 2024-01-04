package com.lvd.app.products.models.service;

import java.util.List;

import com.lvd.app.products.models.entity.Product;

public interface IproductService {
	public List<Product> findAll();
	public Product findById(Long id);
}
