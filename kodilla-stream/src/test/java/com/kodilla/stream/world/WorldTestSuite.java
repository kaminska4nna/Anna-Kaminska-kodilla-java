package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {
    private ArrayList<Country> listEuropeQuantity;
    private ArrayList<Country> listAfricaQuantity;
    private ArrayList<Country> listAsiaQuantity;
    private ArrayList<Continent> listWorldContinents;
    private World world;

    @Test
    public void testGetPeopleQuantityForWorld() {
        listAfricaQuantity = new ArrayList<>();
        listAsiaQuantity = new ArrayList<>();
        listEuropeQuantity = new ArrayList<>();
        listWorldContinents = new ArrayList<>();

        listEuropeQuantity.add(new Country("Poland", new BigDecimal(38000000)));
        listEuropeQuantity.add(new Country("Germany", new BigDecimal(80000000)));
        listEuropeQuantity.add(new Country("Italy", new BigDecimal(60000000)));
        listEuropeQuantity.add(new Country("Belgium", new BigDecimal(11000000)));

        listAsiaQuantity.add(new Country("Japan", new BigDecimal(126000000)));
        listAsiaQuantity.add(new Country("Russia", new BigDecimal(144000000)));
        listAsiaQuantity.add(new Country("China", new BigDecimal(1387000000)));
        listAsiaQuantity.add(new Country("Israel", new BigDecimal(8000000)));

        listAfricaQuantity.add(new Country("Egypt", new BigDecimal(89000000)));
        listAfricaQuantity.add(new Country("Sudan", new BigDecimal(40000000)));
        listAfricaQuantity.add(new Country("Algeria", new BigDecimal(39000000)));
        listAfricaQuantity.add(new Country("Kenya", new BigDecimal(45000000)));

        listWorldContinents.add(new Continent(listAfricaQuantity));
        listWorldContinents.add(new Continent(listAsiaQuantity));
        listWorldContinents.add(new Continent(listEuropeQuantity));

        world = new World(listWorldContinents);

        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();
        BigDecimal worldPeopleQuantityTest = new BigDecimal(2067000000);

        Assert.assertEquals(worldPeopleQuantityTest, worldPeopleQuantity);
    }

}
