package com.mobikwik.country.repository;

import com.mobikwik.country.model.Country;
import lombok.Data;

import java.util.Objects;

@Data
public class CountryRepos {
    private String country;
    public static CountryRepos from(Country country){
        CountryRepos countryRepos = new CountryRepos();
        if(Objects.nonNull(country)){
            countryRepos.setCountry("("+country.getCountryId()+") -"+country.getCountryName());
        }
        return countryRepos;
    }
}
