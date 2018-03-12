package org.food.supplier.services;

import java.util.List;

import org.food.supplier.views.CartView;

public interface CartService {
	public CartView getCartById(Integer id);	
	public List<CartView> getCart();
	Boolean saveCart(CartView cartView);
}
