package com.code.springbootcoban.services.impls;

import com.code.springbootcoban.models.Country;
import com.code.springbootcoban.repositories.CountryRepository;
import com.code.springbootcoban.services.interfaces.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findOne(Long id) {
        return countryRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public Country update(Long id, Country country) {
        Country countryUpdated = countryRepository.findById(id).orElseThrow();
        country.setId(countryUpdated.getId());
        return countryRepository.save(country);
    }
}
