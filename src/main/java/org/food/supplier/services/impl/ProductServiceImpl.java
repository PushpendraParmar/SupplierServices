package org.food.supplier.services.impl;

import org.food.supplier.dao.ProductDAO;
import org.food.supplier.services.ProductService;
import org.food.supplier.views.ProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public ProductView getProductById(Integer id) {
		return ProductView.toView(productDAO.getProductById(id));
	}
	
	public Boolean saveProduct(ProductView view){
		productDAO.save(ProductView.toEntity(view));
		return Boolean.TRUE;
	}

}
