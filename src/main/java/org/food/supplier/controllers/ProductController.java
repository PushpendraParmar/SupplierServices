package org.food.supplier.controllers;

import org.food.supplier.rest.ProductEndPoint;
import org.food.supplier.services.ProductService;
import org.food.supplier.views.ProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController implements ProductEndPoint {

	@Autowired
	private ProductService productService;
	
	@Override
	public @ResponseBody ProductView getProductDetails(@PathVariable(value = "id") Integer id) {
		return productService.getProductById(id);
	}

	@Override
	public @ResponseBody Boolean getSaveProduct(@RequestBody ProductView productView) {
		return productService.saveProduct(productView);
	}
}
