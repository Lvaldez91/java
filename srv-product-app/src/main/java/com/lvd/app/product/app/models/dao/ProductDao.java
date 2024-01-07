package com.lvd.app.product.app.models.dao;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.lvd.app.product.app.models.entity.Product;

//se inyecta automatico debido a que se utiliza el CrudRepository
public interface ProductDao extends CrudRepository <Product, Long>{
}

