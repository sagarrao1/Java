package com.naveen.SpringSecurityApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.SpringSecurityApp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByName(String name);
}
