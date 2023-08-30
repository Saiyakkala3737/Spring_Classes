package com.training.basicauth;
import org.springframework.data.repository.CrudRepository;

import com.training.basicauth.dao.Userdetails;



public interface UserRepository extends CrudRepository<Userdetails, Integer> {

}
