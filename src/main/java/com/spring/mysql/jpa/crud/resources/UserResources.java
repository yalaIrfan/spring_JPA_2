package com.spring.mysql.jpa.crud.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mysql.jpa.crud.model.Users;
import com.spring.mysql.jpa.crud.repository.UserRepository;

@RestController
@RequestMapping(value="/rest/users")
public class UserResources {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping(value="/all")
	public List<Users> getAll(){
		return userRepository.findAll();
	}
	
	@GetMapping(value="/find/{id}")
	public Users findUser(@PathVariable("id") int id){
		return userRepository.findOne(id);
	}
	
	@PostMapping("/create")
	public List<Users> persist(@RequestBody final Users users)
	{
		userRepository.save(users);
		return userRepository.findAll();
	}
	

}
