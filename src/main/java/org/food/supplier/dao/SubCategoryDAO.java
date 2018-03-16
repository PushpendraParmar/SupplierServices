package org.food.supplier.dao;

import java.util.List;

import org.food.supplier.domain.SubCategory;

public interface SubCategoryDAO {

	SubCategory getSubCategoryById(Integer id);
	public List<SubCategory> getSubCategory();
	void save(SubCategory subCategory);
}
