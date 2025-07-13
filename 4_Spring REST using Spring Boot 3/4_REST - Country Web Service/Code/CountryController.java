package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START");

        // Load spring XML configuration from classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // Retrieve the bean named 'country' of type Country
        Country country = context.getBean("country", Country.class);

        LOGGER.info("Country: {}", country);
        LOGGER.info("END");

        return country;  // Spring automatically converts this to JSON
    }
}
