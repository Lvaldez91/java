package com.pentagono.lvd.entitys;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Products {
	@Id
	@Column(name="ProductId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ProductId;
	
	@Column(name="NameProduct", nullable=false, length=30)
	private String NameProduct;

	public Long getProductId() {
		return ProductId;
	}

	public void setProductId(Long productId) {
		ProductId = productId;
	}

	public String getNameProduct() {
		return NameProduct;
	}

	public void setNameProduct(String nameProduct) {
		NameProduct = nameProduct;
	}
	
}
