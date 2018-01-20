package com.spring.mysql.jpa.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.mysql.jpa.crud.model.Users;

@Component
public interface UserRepository extends JpaRepository<Users, Integer>{

}
