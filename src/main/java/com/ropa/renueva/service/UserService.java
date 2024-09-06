package com.ropa.renueva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ropa.renueva.exceptions.UserNotFoundException;
import com.ropa.renueva.model.User;
import com.ropa.renueva.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	// Inyección de dependencias en el constructor
	 @Autowired
	 public UserService(UserRepository userRepository) {
	  super();
	  this.userRepository = userRepository;
	 }
	
	// Método para obtener todos los usuarios
	  public List<User> getAll() {
	   return  userRepository.findAll(); 
	  }
	 
	// Método para crear un usuario
	  public User createUser(User newUser) {
	   return userRepository.save(newUser);
	  }
	  
	//Método para eliminar un usuario mediante Id
	  public void deleteUser(Long id) {
	   if (userRepository.existsById(id)) {
	    userRepository.deleteById(id);
	   } else {
	    throw new UserNotFoundException(id);
	   }
	  }
	  
	//Método para recuperar usuario por id 
	  public User getById(Long id) {
	         return userRepository.findById(id)
	                 .orElseThrow(() -> new UserNotFoundException(id));
	  }
	 
	 
	 
}
