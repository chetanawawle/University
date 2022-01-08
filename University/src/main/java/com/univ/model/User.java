package com.univ.model;

import javax.persistence.Entity;
import javax.persistence.Id;



	@Entity
	public class User 
	{
	    @Id
		private int id;
	  	private String password;
	   	private String username;
	   	
		public User() {
			
			
		}
		public User(int id,String username, String password) {
			super();
			this.id = id;
			this.password = password;
			this.username = username;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
	}
