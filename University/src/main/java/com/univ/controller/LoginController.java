package com.univ.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.univ.model.User;
import com.univ.service.Loginservice;



@RestController
public class LoginController {
	
	@Autowired
	private Loginservice serv;
	
	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		
		int tempId = user.getId();
		String temppass =user.getPassword();
		
		if(tempId!= 0 && !"".equals(temppass)) {
		User userobj = serv.fetchUserById(tempId);
			if(userobj != null) {
				throw new Exception("user with "+tempId+"already exist");
			}			
		}
		User userobj = null;
		userobj = serv.saveUser(user);
			return userobj;}
		
	
	
	
	@PostMapping("/log")
	public User loginUser(@RequestBody User user) throws Exception  {
		int tempId= user.getId();
		String tempPass = user.getPassword();
		//String tempName = user.getUsername();
      // User userobj =null; User userobj =null;
		
		User userobj =null;
		 if(tempId != 0 && tempPass != null) {
			 userobj =serv.fetchUserByIdAndPassword(tempId ,tempPass);
		 }
		 if(userobj ==null) {
			 throw new Exception("Bad credentials! check your MailId or Password");
		 }
		 return userobj;
		}
	
	}