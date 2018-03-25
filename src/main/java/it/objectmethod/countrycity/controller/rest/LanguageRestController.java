package it.objectmethod.countrycity.controller.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.objectmethod.countrycity.model.Language;
import it.objectmethod.countrycity.repo.LanguageRepository;


@RestController
@CrossOrigin
@RequestMapping(value="/api/languages")
public class LanguageRestController {
	
	@Autowired
	private LanguageRepository repo;
	
	@GetMapping(value="/list")
	public List<Language> getCountriesLanguages(){
		List<Language> ret=null;
		ret=repo.findAll();
		return ret;
	}
}