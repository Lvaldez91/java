package com.lvd.app.products.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lvd.app.products.models.entity.Product;

// Se registra como un beans o un componente utilizando @service
@Service
public class ProductServiceImpl implements IproductService{

	@Autowired
	//@Lazy
	private IproductService productDao;
	
	@Override
	@Transactional(readOnly =  true)
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>)productDao.findAll();
	}

	@Override
	@Transactional(readOnly =  true)
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}
}
