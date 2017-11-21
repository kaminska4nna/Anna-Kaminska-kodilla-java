package com.kodilla.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {

    @Test
    public void testDefaultInvestingStrategies() {

        Customer steven = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer kodilla = new CorporateCustomer("Kodilla");

        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {

        Customer steven = new IndividualCustomer("Steven Links");

        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should : " + stevenShouldBuy);
        steven.setBuyingStrategy(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should : " + stevenShouldBuy);

        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);

    }


}
