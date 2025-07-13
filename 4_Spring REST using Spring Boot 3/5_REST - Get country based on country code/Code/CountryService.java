package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private List<Country> countries;

    public CountryService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        countries = (List<Country>) context.getBean("countryList");
    }

    public Country getCountry(String code) {
        if (code == null) {
            return null;
        }

        // Case insensitive match to find the country
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
