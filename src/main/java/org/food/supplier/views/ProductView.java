package org.food.supplier.views;

import org.food.supplier.domain.Product;

public class ProductView {

	private Integer productId;

	private String name;

	private float price;

	private Float weight;

	private String sku;

	private String cartDesc;

	private String shortDesc;

	private String longDesc;
	
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getCartDesc() {
		return cartDesc;
	}

	public void setCartDesc(String cartDesc) {
		this.cartDesc = cartDesc;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	
	
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public static Product toEntity(ProductView productView){
		Product prod = new Product();
		prod.setCartDesc(productView.getCartDesc());
		prod.setLongDesc(productView.getLongDesc());
		prod.setName(productView.getName());
		prod.setPrice(productView.getPrice());
		prod.setProductId(productView.getProductId());
		prod.setShortDesc(productView.getShortDesc());
		prod.setSku(productView.getSku());
		prod.setWeight(productView.getWeight());
		prod.setImageName(productView.getImageName());
		return prod;
		
	}
	public static ProductView toView(Product product){
		ProductView view = new ProductView();
		view.setCartDesc(product.getCartDesc());
		view.setLongDesc(product.getLongDesc());
		view.setName(product.getName());
		view.setPrice(product.getPrice());
		view.setProductId(product.getProductId());
		view.setShortDesc(product.getShortDesc());
		view.setSku(product.getSku());
		view.setWeight(product.getWeight());
		view.setImageName(product.getImageName());
		return view;
		
	}

}
