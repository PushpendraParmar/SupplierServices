package org.food.supplier.views;

import org.food.supplier.domain.Product;

public class ProductView {

	private Integer productId;

	private String name;

	private String desc;
	
	private String imageName;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public static Product toEntity(ProductView productView){
		Product prod = new Product();
		prod.setProductId(productView.getProductId());
		prod.setName(productView.getName());
		prod.setDesc(productView.getDesc());
		prod.setImageName(productView.getImageName());
		return prod;
		
	}
	public static ProductView toView(Product product){
		ProductView view = new ProductView();
		view.setDesc(product.getDesc());
		view.setName(product.getName());
		view.setProductId(product.getProductId());
		view.setImageName(product.getImageName());
		return view;
		
	}

}
