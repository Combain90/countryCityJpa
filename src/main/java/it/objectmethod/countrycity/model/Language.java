package it.objectmethod.countrycity.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity()
@Table(name="countrylanguage")
public class Language {
	
	@EmbeddedId
	private CountryLanguage countrylanguage;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Countrycode", insertable=false, updatable=false)
	@Fetch(FetchMode.JOIN)
	Country country;

	public CountryLanguage getCountrylanguage() {
		return countrylanguage;
	}

	public void setCountrylanguage(CountryLanguage countryLanguage) {
		this.countrylanguage = countryLanguage;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
