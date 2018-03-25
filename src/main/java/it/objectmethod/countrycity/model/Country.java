package it.objectmethod.countrycity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Country {
	
	@Id
	private String Code;

	private String Name,Region,Population,Continent;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="Countrycode")
	@JsonIgnore
	private List<City> city;
	
	public void setCode(String code) {
		Code = code;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

	public List<City> getCity() {
		return city;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getPopulation() {
		return Population;
	}

	public void setPopulation(String population) {
		Population = population;
	}

	public String getContinent() {
		return Continent;
	}

	public void setContinent(String continent) {
		Continent = continent;
	}

	public String getCode() {
		return Code;
	}
	
}
