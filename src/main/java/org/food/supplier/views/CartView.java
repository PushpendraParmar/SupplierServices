package org.food.supplier.views;

import org.food.supplier.domain.Cart;
import org.food.supplier.domain.Product;
import org.food.supplier.domain.User;

public class CartView {

	private Integer cartId;
	private Product productId;	
	private String status;
	private User userId;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public static Cart toEntity(CartView cartView){
		Cart cart = new Cart();
		cart.setCartId(cartView.getCartId());
		cart.setProductId(cartView.getProductId());
		cart.setUserId(cartView.getUserId());
		cart.setStatus(cartView.getStatus());
		return cart;
		
	}
	public static CartView toView(Cart cart){
		CartView view = new CartView();
		view.setCartId(cart.getCartId());
		view.setProductId(cart.getProductId());
		view.setUserId(cart.getUserId());
		view.setStatus(cart.getStatus());
		return view;
		
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	
}
