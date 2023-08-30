package com.training.userservice.service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.userservice.Exceptions.UserNotFoundException;
import com.training.userservice.dao.UserRepository;
import com.training.userservice.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public List<User> getusersByPage(int pageNo,int pageSize) {
		Pageable pageable= PageRequest.of(pageNo,pageSize);
		Page<User> page=repo.findAll(pageable);
		return page.toList();
	}

	public User getUserId(int uid) {
		return repo.findById(uid).orElseThrow(() -> new UserNotFoundException("User not found with id :" + uid));
	}

	public User getname(String name) {
		return repo.findByname(name);
	}

	public ArrayList<User> getaddr(String addr) {
		return repo.findByaddr(addr);
	}

	public User insertUser(User usr) {
		return repo.save(usr);
	}

	public User UpdateUser(int uid, User usr) {
		User existing = this.getUserId(usr.getUid());
		if (usr.getName() != null)
			existing.setName(usr.getName());
		if (usr.getAddr() != null)
			existing.setAddr(usr.getAddr());
		return repo.save(existing);
	}

	public String DeleteUser(int uid) {
		repo.deleteById(uid);
		return "user deleted with id::" + uid;
	}

	public User getUserAddress(String name, String addr) {
		return repo.findUserAddrandName(name, addr);
	}

}
