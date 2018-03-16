package org.food.supplier.views;

import org.food.supplier.domain.Category;
import org.food.supplier.domain.SubCategory;

public class SubCategoryView {
	private Integer subCatId;	
	private Category category;
	private String subCategoryName;	
	private String description;
	private String status;
	
	public Integer getSubCatId() {
		return subCatId;
	}
	public void setSubCatId(Integer subCatId) {
		this.subCatId = subCatId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static SubCategory toEntity(SubCategoryView view){
		SubCategory subCategory = new SubCategory();
		subCategory.setSubCatId(view.getSubCatId());
		subCategory.setSubCategoryName(view.getSubCategoryName());
		subCategory.setStatus(view.getStatus());
		subCategory.setCategory(view.getCategory());
		subCategory.setDescription(view.getDescription());
		return subCategory;
	}
	
	public static SubCategoryView toView(SubCategory subCategory){
		SubCategoryView view = new SubCategoryView();
		view.setSubCatId(subCategory.getSubCatId());
		view.setSubCategoryName(subCategory.getSubCategoryName());
		view.setCategory(subCategory.getCategory());
		view.setDescription(subCategory.getDescription());
		view.setStatus(subCategory.getStatus());
		
		return view;
	}
}
