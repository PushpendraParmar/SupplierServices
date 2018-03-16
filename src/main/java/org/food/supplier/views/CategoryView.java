package org.food.supplier.views;

import org.food.supplier.domain.Category;
import org.food.supplier.domain.Product;


public class CategoryView {

	private int categoryId;	
	private String categoryName;	
	private String description;
	private String status;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
	
	public static Category toEntity(CategoryView categoryView){
		Category cat = new Category();
		cat.setCategoryId(categoryView.getCategoryId());
		cat.setCategoryName(categoryView.getCategoryName());
		cat.setDescription(categoryView.getDescription());
		cat.setStatus(categoryView.getStatus());
		return cat;
	}
	
	public static CategoryView toView(Category category){
		CategoryView view = new CategoryView();
		view.setCategoryId(category.getCategoryId());
		view.setCategoryName(category.getCategoryName());
		view.setDescription(category.getDescription());
		view.setStatus(category.getStatus());
		return view;
		
	}
}
