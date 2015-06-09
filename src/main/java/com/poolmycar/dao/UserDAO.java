package com.poolmycar.dao;

import com.poolmycar.domain.User;

public interface UserDAO {
	public User getUser(String username);
	public void saveUser(User user);
	public void updateUser(User user);
}
