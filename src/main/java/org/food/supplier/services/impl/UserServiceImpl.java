package org.food.supplier.services.impl;

import org.food.supplier.dao.UserDAO;
import org.food.supplier.domain.User;
import org.food.supplier.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userDAO.getUserByName(name);
	}
	
	

}
