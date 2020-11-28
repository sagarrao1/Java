package com.naveen.SpringSecurityApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.naveen.SpringSecurityApp.model.User;
import com.naveen.SpringSecurityApp.repository.UserRepository;

@Service
public class MyUserDetailService  implements UserDetailsService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user= repo.findByName(username);
		if (user==null)
			throw new UsernameNotFoundException("User not found in mysql Database");
		
		return new UserDetailsImpl(user);
	}

}
