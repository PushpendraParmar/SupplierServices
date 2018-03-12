package org.food.supplier.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.food.supplier.views.CartView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RequestMapping
@EnableWebMvc
public interface CartEndPoint {

	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public CartView getCartDetails(Integer id);
	
	@RequestMapping(value="save", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON)
	public Boolean getSaveCart( CartView cartView);
	
	@RequestMapping(value="cart", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<CartView> getCart();
	
}
