package com.poolmycar.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.poolmycar.dao.UserDAO;
import com.poolmycar.domain.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	//private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	//private MongoOperations mongoOps;
	private MongoTemplate mongoTemplate;
	
	
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		//mongoOps.save(user);
		mongoTemplate.insert(user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

}
