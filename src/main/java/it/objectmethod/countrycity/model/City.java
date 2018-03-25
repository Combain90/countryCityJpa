package it.objectmethod.countrycity.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class City {
	
	@Id
	@GeneratedValue
	private Long ID;
	
	private String Name,District,Population;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Countrycode")
	@Fetch(FetchMode.JOIN)
	private Country country;
	
	public void setID(Long iD) {
		ID = iD;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getPopulation() {
		return Population;
	}

	public void setPopulation(String population) {
		Population = population;
	}

	public Long getID() {
		return ID;
	}
}
