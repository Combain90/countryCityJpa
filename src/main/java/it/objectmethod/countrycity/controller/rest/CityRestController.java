package it.objectmethod.countrycity.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.countrycity.model.City;
import it.objectmethod.countrycity.model.Country;
import it.objectmethod.countrycity.repo.CityRepository;

@RestController
@CrossOrigin
@RequestMapping(value="/api/cities")
public class CityRestController {
	
	@Autowired
	private CityRepository repo;
	
	@RequestMapping("/{codiceStato}/list")
	public List<City> citiesByCountry (@PathVariable("codiceStato") String codice) {
		List<City> lista=null;
		lista=repo.getCitiesByCode(codice);
		return lista;
	}
	
	@PostMapping(value="/add")
	public int addCity(@RequestBody City json) { // il Json arrivato è direttamente Convertito in Oggeto. Thanks @RequestBody
		repo.save(json);
		return 1; 
	}
	
	@PostMapping(value="/{id}/example")
	public Optional<City> getCountryOfCitybyId(@PathVariable("id") Long id) {
		Optional<City> c=repo.findById(id);
		return c;
	}
	
	@RequestMapping("/{codiceStato}/country")
	public Country getCountry (@PathVariable("codiceStato") String codice) {
		List<City> lista=null;
		lista=repo.getCitiesByCode(codice);
		return lista.get(0).getCountry();
	}
}
