package org.food.supplier.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.food.supplier.dao.CategoryDAO;
import org.food.supplier.domain.Category;
import org.food.supplier.services.CategoryService;
import org.food.supplier.views.CategoryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDAO categoryDAO;
	
	@Override
	public CategoryView getCategoryById(Integer id) {
		return CategoryView.toView(categoryDAO.getCategoryById(id));
	}

	@Override
	public List<CategoryView> getAllCategory() {
		List<Category> catList = categoryDAO.getCategory();
		List<CategoryView> categoryViewList = new ArrayList<CategoryView>(catList.size());
		for(Category cat : catList){
			categoryViewList.add(CategoryView.toView(cat));
		}
		return categoryViewList;
	}

	@Override
	public Boolean saveCategory(CategoryView view) {
		categoryDAO.save(CategoryView.toEntity(view));
		return Boolean.TRUE;
	}

}
