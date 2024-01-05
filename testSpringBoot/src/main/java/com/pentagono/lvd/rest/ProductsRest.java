package com.pentagono.lvd.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pentagono.lvd.dao.ProductsDAO;
import com.pentagono.lvd.entitys.Products;

@RestController
@RequestMapping("products")
public class ProductsRest {
	
	@Autowired
	private ProductsDAO productsDAO;
	
	@GetMapping
	public ResponseEntity<List<Products>> getProduct(){
		List<Products> products = productsDAO.findAll();
		return ResponseEntity.ok(products);
	}
	
	@RequestMapping(value="{productId}")
	public ResponseEntity<Products> getProductById(@PathVariable("productId") Long productId){
		Optional<Products> optionalProduct = productsDAO.findById(productId);
		if(!optionalProduct.isPresent()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(optionalProduct.get());
		}
	}
	
	@PostMapping
	public ResponseEntity<Products> createProduct(@RequestBody Products product){
		Products newProduct = productsDAO.save(product);
		return ResponseEntity.ok(newProduct); 
	}
	
	@DeleteMapping(value="{productId}")
	public ResponseEntity<Void> deleteProduct(@PathVariable("productId") Long productId){
		productsDAO.deleteById(productId);
		return ResponseEntity.ok(null); 
	}
	
	@PutMapping
	public ResponseEntity<Products> updateProduct(@RequestBody Products product){
		Optional<Products> optionalProduct = productsDAO.findById(product.getProductId());
		if(!optionalProduct.isPresent()) {
			return ResponseEntity.noContent().build();
		} else {
			Products updateProduct = optionalProduct.get();
			updateProduct.setNameProduct(product.getNameProduct());
			productsDAO.save(updateProduct);
			return ResponseEntity.ok(updateProduct);
		}
	}
}
