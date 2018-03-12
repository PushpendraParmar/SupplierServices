package org.food.supplier.services;

import java.util.List;

import org.food.supplier.views.ProductView;

public interface ProductService {

	public ProductView getProductById(Integer id);
	
	public List<ProductView> getAllProduct();
	
	Boolean saveProduct(ProductView productView);
}
