package com.univ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.univ.repository.LoginRepository;



@Service
public class Loginservice {

@Autowired
private LoginRepository repo;
public User saveUser(User user) {
	
	return repo.save(user);
	
}

public User fetchUserByIdAndPassword(int id,String username, String password) {
	
	return repo.findByIdAndPassword(username, password);
}


}