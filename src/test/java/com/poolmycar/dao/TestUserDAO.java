package com.poolmycar.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poolmycar.BaseSpringJunit;
import com.poolmycar.domain.User;

public class TestUserDAO extends BaseSpringJunit{
	
	@Autowired
	UserDAO userDAO;
	
	@Test
	public void testSaveUser() throws Exception {
		User user = new User();
		user.setUsername("ukb");
		user.setEmail("uttamkumarbiswas@gmail.com");
		user.setFirstname("uttamkumar");
		user.setLastname("biswas");
		user.setPhone(9775213029l);
		user.setProfession("s/w engg");
		user.setDescription("I love to offer a lift");
		//userDAO.saveUser(user);
	}

}
