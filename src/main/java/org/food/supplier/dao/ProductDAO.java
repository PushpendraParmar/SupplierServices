package org.food.supplier.dao;

import org.food.supplier.domain.Product;

public interface ProductDAO {
	Product getProductById(Integer id);
	void save(Product product);
}
