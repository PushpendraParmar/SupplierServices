package org.food.supplier.controllers;

import java.util.List;

import org.food.supplier.rest.CartEndPoint;
import org.food.supplier.services.CartService;
import org.food.supplier.views.CartView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = {"http://localhost:4200"})
public class CartController implements CartEndPoint {

	@Autowired
	private CartService cartService;
	
	@Override
	public @ResponseBody CartView getCartDetails(@PathVariable(value = "id") Integer id) {
		return cartService.getCartById(id);
	}

	@Override
	public @ResponseBody Boolean getSaveCart(@RequestBody CartView cartView) {
		return cartService.saveCart(cartView);
	}

	@Override
	public @ResponseBody List<CartView> getCart() {
		return cartService.getCart();
	}

}
