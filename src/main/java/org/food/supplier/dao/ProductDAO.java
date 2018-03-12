package org.food.supplier.dao;

import java.util.List;

import org.food.supplier.domain.Product;

public interface ProductDAO {
	Product getProductById(Integer id);
	public List<Product> getProducts();
	void save(Product product);
}
