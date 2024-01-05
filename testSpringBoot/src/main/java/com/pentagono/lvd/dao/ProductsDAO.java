package com.pentagono.lvd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pentagono.lvd.entitys.*;


public interface ProductsDAO extends JpaRepository<Products,Long>{
	//Products finByName(String nameProduct);
}
