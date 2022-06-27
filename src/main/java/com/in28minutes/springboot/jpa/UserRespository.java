package com.in28minutes.springboot.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRespository extends CrudRepository <User, Long>{

	List<User> findByRole(String role);
	
}
