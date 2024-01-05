package com.pentagono.lvd.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pentagono.lvd.dao.UsersDAO;
import com.pentagono.lvd.entitys.UserEntity;

@RestController
@RequestMapping("Users")
public class UsersRest {
	@Autowired
	private UsersDAO userDAO;
	
	@GetMapping
	public ResponseEntity<List<UserEntity>> getProduct(){
		List<UserEntity> user = userDAO.findAll();
		return ResponseEntity.ok(user);
	}
	
	@RequestMapping(value="{Id}")
	public ResponseEntity<UserEntity> getUserLogin(@PathVariable("Id") Long Id){
		Optional<UserEntity> opcUser = userDAO.findById(Id);
		if(!opcUser.isPresent()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(opcUser.get());
		}
	}
}
