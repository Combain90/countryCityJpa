package it.objectmethod.countrycity.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import it.objectmethod.countrycity.model.City;

public interface CityRepository extends JpaRepository<City,Long> {
	
	@Query(value="SELECT city.ID , city.Name , city.CountryCode, city.Population , city.District FROM city  WHERE city.CountryCode = :code", nativeQuery=true)
	public List<City> getCitiesByCode(@Param("code") String code);

}
