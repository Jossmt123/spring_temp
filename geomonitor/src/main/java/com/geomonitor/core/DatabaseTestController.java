package com.geomonitor.core;

import com.geomonitor.model.Country;
import com.geomonitor.services.CountryDAOHandler;
import org.hibernate.SessionFactory;
import org.hibernate.impl.SessionFactoryImpl;

public class DatabaseTestController {

    public static void main(String[] args){

        CountryDAOHandler handler = new CountryDAOHandler();

        Country country = new Country();
        country.setCountryName("United Kingdom");
        country.setCapital("London");
        country.setGDP(12500000);
        country.setPopulation(70000000);

        handler.save(country);
    }
}
