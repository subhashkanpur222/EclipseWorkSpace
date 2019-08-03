package com.loveingcode.Helloworld.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@RestController 
public class UserResource {
	@Autowired
	private UserDaoService service;
	
	//Retrieve All users
	//Get /users
	@GetMapping("/users")
	public List<User> retrieveAllUsers()
	{
		return service.findAll();
	}
	
	//Get /users/{id}
	//Retrieve user based on id
	@GetMapping("/users/{id}")
	public User findUser(@PathVariable int id)
	{
		User user = service.findOne(id);
		if(user == null)
			throw new UserNotFoundException("id-"+id);
		return user;
	}
	
	//Delete user   
	//Input user id
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		User user = service.deleteById(id);
		if(user == null)
			throw new UserNotFoundException("id-"+id);
	}
	
	//Save user 
	//Input: Details of user
	//Output: Created and return created URI
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
	{
		User savedUser = service.save(user);
	//Created
	// user/{id} savedUser.getId()
	URI location = ServletUriComponentsBuilder
				   .fromCurrentRequest()
				   .path("/{id}")
				   .buildAndExpand(savedUser.getId()).toUri();
	return ResponseEntity.created(location).build();
	}
}
