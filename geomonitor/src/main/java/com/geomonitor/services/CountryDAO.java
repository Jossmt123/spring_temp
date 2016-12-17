package com.geomonitor.services;

import com.geomonitor.model.Country;

import java.util.List;

public interface CountryDAO {

    public void save(Country c);

    public List<Country> list();
}
