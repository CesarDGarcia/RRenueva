package com.ropa.renueva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ropa.renueva.model.User;
import com.ropa.renueva.service.UserService;

@RestController
@RequestMapping("/api/v1")
//CORS
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
	private UserService userService;
	 @Autowired
	 public UserController(UserService userService) {
	  this.userService= userService;
	 }
	 @GetMapping("/usuariosropa")
	 public List <User> getMappingAll(){
	  return userService.getAll();
	 }
	 
	 
	 @PostMapping
	 public User newUser(@RequestBody User Usuarios) {
	 return userService.createUser(Usuarios);
	 }
	 
	 
	 @DeleteMapping("/usuariosropa/{id}")
	 public void deleteUser(@PathVariable(name = "id") Long id) {
	     userService.deleteUser(id);
	 }
	 
	 @GetMapping("/usuariosropa/{id}") 
	 public User getById (@PathVariable(name = "id") Long id) {
	        return userService.getById(id);
	    }
	 
	 
	 
}
