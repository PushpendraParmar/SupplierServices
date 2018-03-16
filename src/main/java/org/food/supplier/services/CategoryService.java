package org.food.supplier.services;

import java.util.List;

import org.food.supplier.views.CategoryView;

public interface CategoryService {

	public CategoryView getCategoryById(Integer id);
	
	public List<CategoryView> getAllCategory();
	
	Boolean saveCategory(CategoryView categoryView);
}
