package com.lvd.app.product.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lvd.app.product.app.models.entity.Product;

//Se registra como un beans o un componente utilizando @service
@Service
public class ProductServiceImpl implements IproductService{

	@Autowired
	@Lazy
	private IproductService productDao;
	
	@Override
	@Transactional(readOnly =  true)
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		
		if(products.size()==0) {
			return null;
		}
		return (List<Product>)productDao.findAll();
	}

	@Override
	@Transactional(readOnly =  true)
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}
}
