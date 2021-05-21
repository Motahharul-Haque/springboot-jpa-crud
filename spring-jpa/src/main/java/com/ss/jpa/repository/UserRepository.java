package com.ss.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ss.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	public List<User> findByOrderByName();

	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u WHERE u.name =:n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query("select u FROM User u WHERE u.name =:n and u.city =:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);
}
