package org.food.supplier.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.food.supplier.dao.SubCategoryDAO;
import org.food.supplier.domain.SubCategory;
import org.food.supplier.services.SubCategoryService;
import org.food.supplier.views.ProductView;
import org.food.supplier.views.SubCategoryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{

	@Autowired
	SubCategoryDAO subCategoryDAO;
	
	@Override
	public SubCategoryView getSubCategoryById(Integer id) {
		return SubCategoryView.toView(subCategoryDAO.getSubCategoryById(id));
	}

	@Override
	public List<SubCategoryView> getAllSubCategory() {
		List<SubCategory> subCatList = subCategoryDAO.getSubCategory();
		List<SubCategoryView> subCategoryView = new ArrayList<SubCategoryView> (subCatList.size());
		for(SubCategory subCategory : subCatList){
			subCategoryView.add(SubCategoryView.toView(subCategory));
		}
		return subCategoryView;
	}

	@Override
	public Boolean saveSubCategory(SubCategoryView View) {
		subCategoryDAO.save(SubCategoryView.toEntity(View));
		return Boolean.TRUE;
	}



}
