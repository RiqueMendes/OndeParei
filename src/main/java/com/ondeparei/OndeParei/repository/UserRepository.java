package com.ondeparei.OndeParei.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ondeparei.OndeParei.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public List<User> findAllByNameContainingIgnoreCase (String name);
	
}
