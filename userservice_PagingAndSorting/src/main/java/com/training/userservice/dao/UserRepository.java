package com.training.userservice.dao;

import java.awt.print.Pageable;
import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.userservice.model.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
	
	public User findByname(String name);
	
	public ArrayList<User> findByaddr(String addr);
	
	@Query(value="SELECT * FROM user WHERE name = :name AND addr = :address",nativeQuery = true)
	public User findUserAddrandName(@Param (value="name")String name,@Param(value="address") String addr);


}
