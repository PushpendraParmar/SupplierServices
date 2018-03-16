package org.food.supplier.services;

import java.util.List;

import org.food.supplier.views.SubCategoryView;

public interface SubCategoryService {
	public SubCategoryView getSubCategoryById(Integer id);
	
	public List<SubCategoryView> getAllSubCategory();
	
	Boolean saveSubCategory(SubCategoryView subCategoryView);
}
