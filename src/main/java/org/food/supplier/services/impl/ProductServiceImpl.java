package org.food.supplier.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.food.supplier.dao.ProductDAO;
import org.food.supplier.domain.Product;
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
	
	public List<ProductView> getAllProduct(){
		List<Product> prodList = productDAO.getProducts();
		List<ProductView> productViesList = new ArrayList<ProductView>(prodList.size());
		for (Product prod : prodList) {
			productViesList.add(ProductView.toView(prod));
		}
		return productViesList;
	}
	
	
	public Boolean saveProduct(ProductView view){
		productDAO.save(ProductView.toEntity(view));
		return Boolean.TRUE;
	}

}
