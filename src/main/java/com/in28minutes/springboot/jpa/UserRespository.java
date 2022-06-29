package com.in28minutes.springboot.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends CrudRepository <User, Long>{

	List<User> findByRole(String role);
	
}
