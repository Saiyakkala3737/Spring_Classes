package com.apex.user.client;

import com.apex.user.entity.User;
import com.apex.user.dao.*;

public class UserClient {

		public static void main(String[] args) {
			
			User user = new User();
			user.setFirstname("A");
			user.setLastname("B");
			user.setMiddlename("C");
			
			UserDao userdao = new UserDao();
			userdao.addUSER(user);
			
		}
}
