package org.food.supplier.dao;

import org.food.supplier.domain.Country;

public interface CountryDAO {

	Country getCountryById(int id);
	
	Country getCountryByName(String name);
	
}
