package org.food.supplier.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "wishlist")
public class WishList {
	
	@Id
	@Column(name = "wishlist_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer wishlistId;
	
	

}
