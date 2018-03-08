package org.food.supplier.rest;

import javax.ws.rs.core.MediaType;

import org.food.supplier.views.ProductView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RequestMapping("/product/")
@EnableWebMvc
public interface ProductEndPoint {
	
	@RequestMapping(value="{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public ProductView getProductDetails( Integer id);
	
	@RequestMapping(value="save", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON)
	public Boolean getSaveProduct( ProductView productView);
	
}
