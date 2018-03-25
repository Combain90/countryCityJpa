package it.objectmethod.countrycity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import it.objectmethod.countrycity.model.CountryLanguage;
import it.objectmethod.countrycity.model.Language;

public interface LanguageRepository extends JpaRepository<Language, CountryLanguage> {

}
