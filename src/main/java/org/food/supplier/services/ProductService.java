package org.food.supplier.services;

import org.food.supplier.views.ProductView;

public interface ProductService {

	public ProductView getProductById(Integer id);
	
	Boolean saveProduct(ProductView productView);
}
