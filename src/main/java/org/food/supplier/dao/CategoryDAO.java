package org.food.supplier.dao;

import java.util.List;

import org.food.supplier.domain.Category;

public interface CategoryDAO {

	Category getCategoryById(Integer id);
	public List<Category> getCategory();
	void save(Category category);
}
