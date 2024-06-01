package com.code.springbootcoban.controllers;

import com.code.springbootcoban.models.Country;
import com.code.springbootcoban.services.interfaces.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.findAll();
    }

    @PostMapping
    public Country saveCountry(@RequestBody Country country) {
        return countryService.save(country);
    }

    @PutMapping("/{id}")
    public Country updateCountry(@PathVariable Long id, @RequestBody Country country) throws InvocationTargetException, IllegalAccessException {
        return countryService.update(id, country);
    }

    @DeleteMapping("/{id}")
    public String deleteCountry(@PathVariable Long id) {
        countryService.delete(id);
        return "Deleted country with id: " + id;
    }

    @PatchMapping("/{id}")
    public Country updatePatch(@PathVariable Long id, @RequestBody Map<String, ?> data) {
        return countryService.updatePatch(id, data);
    }
}
