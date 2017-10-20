package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continentList = new ArrayList<>();

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public List<Continent> addContinent(Continent continent) {
        continentList.add(continent);
        return continentList;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldQuantity = continentList.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return worldQuantity;

    }
}