package it.objectmethod.countrycity.controller.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.objectmethod.countrycity.model.Country;
import it.objectmethod.countrycity.repo.CountryRepository;

@RestController
@CrossOrigin
@RequestMapping(value="/api/countries")
public class CountryRestController{
	
	@Autowired
	private CountryRepository repo;
	
	@RequestMapping(value="/continents")
	public List<String> continents() {
		List<String> lista=null;
		lista=repo.getContinents();
		return lista;
	}
	
	@RequestMapping(value="/list")
	public List<Country> getAllCountries(){
		List<Country> list=null;
		list=repo.findAll();
		return list;
	}
	
	@RequestMapping("/{continent}/list")
	public List<Country> countriesByContinent(@PathVariable("continent")String continente) {
		List<Country> lista=null;
		lista=repo.getCountriesByContinent(continente);
		return lista;
	}
}