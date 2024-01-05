package com.pentagono.lvd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pentagono.lvd.entitys.UserEntity;

public interface UsersDAO extends JpaRepository<UserEntity,Long>{

}
