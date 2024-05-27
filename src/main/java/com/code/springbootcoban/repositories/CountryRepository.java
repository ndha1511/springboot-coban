package com.code.springbootcoban.repositories;
import com.code.springbootcoban.models.Country;
import com.code.springbootcoban.models.enums.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByNameAndCurrency(String name, Currency currency);
}
