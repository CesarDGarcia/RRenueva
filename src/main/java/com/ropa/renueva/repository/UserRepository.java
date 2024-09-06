package com.ropa.renueva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ropa.renueva.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
