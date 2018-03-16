package org.food.supplier.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.food.supplier.views.CategoryView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RequestMapping("/category")
@EnableWebMvc
public interface CategoryEndPoint {

	@RequestMapping(value="{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public CategoryView getCategoryDetails(Integer id);
	
	@RequestMapping(value="save", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON)
	public Boolean getSaveCategory( CategoryView categoryView);
	
	@RequestMapping(value="categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<CategoryView> getAllCategory();
}
