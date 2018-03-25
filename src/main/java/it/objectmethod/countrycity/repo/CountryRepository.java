package it.objectmethod.countrycity.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import it.objectmethod.countrycity.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	@Query(value="SELECT country.Code, country.Name, country.Region , country.Population, country.Continent FROM country WHERE country.Continent= :continent",nativeQuery=true)
	public List<Country> getCountriesByContinent(@Param("continent") String continent);
	
	@Query(value="SELECT DISTINCT Continent FROM country",nativeQuery=true)
	public List<String> getContinents();
}
