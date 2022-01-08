package com.univ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univ.model.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer>{

	public User findById(int Id);
	public User findByIdAndPassword(int id , String password);
	

}