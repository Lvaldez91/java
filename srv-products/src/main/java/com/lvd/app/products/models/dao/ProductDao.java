package com.lvd.app.products.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.lvd.app.products.models.entity.*;

public interface ProductDao extends CrudRepository <Product, Long>{
}
