package com.lvd.app.products.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.lvd.app.products.models.entity.*;

// se inyecta automatico debido a que se utiliza el CrudRepository
public interface ProductDao extends JpaRepository <Product, Long>{
}
