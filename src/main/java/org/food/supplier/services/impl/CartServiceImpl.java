package org.food.supplier.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.food.supplier.dao.CartDAO;
import org.food.supplier.domain.Cart;
import org.food.supplier.services.CartService;
import org.food.supplier.views.CartView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDAO cartDAO;
	
	
	@Override
	public CartView getCartById(Integer id) {
		return CartView.toView(cartDAO.getCartById(id));
	}

	@Override
	public List<CartView> getCart() {
		List<Cart> cartList = cartDAO.getCart();
		List<CartView> cartViewList = new ArrayList<CartView> (cartList.size());
		for(Cart cart : cartList){
			cartViewList.add(CartView.toView(cart));
		}
		return cartViewList;
	}

	@Override
	public Boolean saveCart(CartView view) {
		cartDAO.save(CartView.toEntity(view));
		return Boolean.TRUE;
	}

}
