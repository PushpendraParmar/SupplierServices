package org.food.supplier.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.food.supplier.views.SubCategoryView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

	@RequestMapping("/subcategory")
	@EnableWebMvc
	public interface SubCategoryEndPoint {

		@RequestMapping(value="{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
		public SubCategoryView getSubCategoryDetails(Integer id);
		
		@RequestMapping(value="save", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON)
		public Boolean getSaveSubCategory( SubCategoryView subCategoryView);		
		@RequestMapping(value="subcategories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
		public List<SubCategoryView> getAllSubCategory();
}
