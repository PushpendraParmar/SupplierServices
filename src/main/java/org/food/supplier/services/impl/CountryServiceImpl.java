package org.food.supplier.services.impl;

import org.food.supplier.dao.CountryDAO;
import org.food.supplier.domain.Country;
import org.food.supplier.services.CountryService;

//@Service
public class CountryServiceImpl implements CountryService{

//	@Autowired
	private CountryDAO countryDAO;
	
	@Override
	public Country getCountryById(int id) {
		return countryDAO.getCountryById(id);
	}
	
	public CountryDAO getCountryDAO(){
		return countryDAO;
	}
	
	public void setCountryDAO(CountryDAO countryDAO){
		this.countryDAO = countryDAO;
		
	}

}
