package com.code.springbootcoban.services.interfaces;

import com.code.springbootcoban.models.Country;

import java.util.List;

public interface CountryService {
    Country save(Country country);
    List<Country> findAll();
    Country findOne(Long id);
    void delete(Long id);
    Country update(Long id, Country country);
}
