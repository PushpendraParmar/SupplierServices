package org.food.supplier.services;

import org.food.supplier.domain.User;

public interface UserService {

	User getUserById(int id);
	User getUserByName(String name);
}
