package it.objectmethod.countrycity.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CountryLanguage implements Serializable {
	
	private static final long serialVersionUID = 7087394571854254734L;
	
	private String Countrycode,Language;
	
	public String getCountrycode() {
		return Countrycode;
	}

	public void setCountryCode(String countryCode) {
		Countrycode = countryCode;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}	
}
