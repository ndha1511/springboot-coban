package com.code.springbootcoban.services.impls;

import com.code.springbootcoban.models.Country;

import com.code.springbootcoban.repositories.CountryRepository;
import com.code.springbootcoban.services.interfaces.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class CountryServiceImpl extends BaseServiceImpl<Country, Long> implements CountryService {

    private CountryRepository countryRepository;

    public CountryServiceImpl(JpaRepository<Country, Long> baseRepository) {
        super(baseRepository);
    }

    @Autowired
    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }



}
