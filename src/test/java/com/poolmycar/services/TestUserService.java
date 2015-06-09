package com.poolmycar.services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poolmycar.BaseSpringJunit;
import com.poolmycar.domain.User;

public class TestUserService extends BaseSpringJunit {

	@Autowired
	UserService userService;
	
	@Test
	public void testGetUser() throws Exception{
		String userNameToFind = "ukb";
		User user = userService.getUser(userNameToFind);
		System.out.println(user.toString());
		assertTrue(userNameToFind.equals(user.getUsername()));
	}
}
