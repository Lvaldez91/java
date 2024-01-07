package com.lvd.app.product.app.models.service;

import java.util.List;

import com.lvd.app.product.app.models.entity.Product;

public interface IproductService {
	public List<Product> findAll();
	public Product findById(Long id);
}
