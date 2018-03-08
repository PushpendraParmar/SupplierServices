package org.food.supplier.dao;

import org.food.supplier.domain.User;

public interface UserDAO {

	User getUserById(int id);
	
	User getUserByName(String name);
	
}
