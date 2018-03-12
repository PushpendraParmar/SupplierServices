package org.food.supplier.dao;

import java.util.List;

import org.food.supplier.domain.Cart;

public interface CartDAO {

	Cart getCartById(Integer id);
	public List<Cart> getCart();
	void save(Cart cart);
	
}
