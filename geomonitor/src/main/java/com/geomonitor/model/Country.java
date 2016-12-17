package com.geomonitor.model;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Table(name="Country")
public class Country {

    @Id
    @Column(name="Name")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String countryName;

    @Column(name="Population")
    private int population;

    @Column(name="Capital")
    private String capital;

    @Column(name="GDP")
    private int GDP;

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        capital = capital;
    }

    public int getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }

    public String getCountryName(){
        return countryName;
    }

    public int getPopulation(){
        return population;
    }

    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public void setPopulation(int population){
        this.population = population;
    }

    @Override
    public String toString(){
        return "Country: " + countryName + " population size: " + population + "\nCapital: " + capital + " GDP: " + GDP;
    }

}
