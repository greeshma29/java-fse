package com.project.pixogram.users.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.pixogram.users.entity.Users;

import com.project.pixogram.users.service.IUsersService;

@RestController
public class UsersController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IUsersService usersService;
	
	/*@GetMapping("/users/{usersId}")
	public ResponseEntity<Users> actionDetail(@PathVariable Integer usersId){
	Optional<Users> record =  this.usersRepository.findById(usersId);
	Users users = new Users();
	if(record.isPresent())
	users = record.get();
	ResponseEntity<Users> response = new ResponseEntity<Users>(users, HttpStatus.OK);
	return response;
	}*/
	
	@GetMapping("/users")
    public ResponseEntity<List<Users>> exposeAll() {
		
		List<Users> users = this.usersService.findAllUsers();
		ResponseEntity<List<Users>> response = 
								new ResponseEntity<List<Users>>(users, HttpStatus.OK);
		
		
		return response;
	}
	
	// {<data variable>}
	@GetMapping("/users/{usersId}") // GET HTTP VERB
	public ResponseEntity<Users> getById(@PathVariable Integer usersId) {
		
		Users users = this.usersService.findUsersById(usersId);
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	// @RequestMapping(value =  "/students", method = RequestMethod.POST)
	@PostMapping("/users") // POST HTTP VERB
	public ResponseEntity<Users> save(@RequestBody Users users) {
		this.usersService.addUsers(users);
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	@PutMapping("/users")
	public ResponseEntity<Users> saveUpdate(@RequestBody Users users) {
		this.usersService.updateUsers(users);
			
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	@DeleteMapping("/users/{usersId}")
	public ResponseEntity<Users> delete(@PathVariable Integer usersId) {
		
		Users users = this.usersService.findUsersById(usersId);
		this.usersService.deleteUsers(usersId);
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(users, HttpStatus.OK);

		return response;
	}
	
	
	
	
	
	
	
}
