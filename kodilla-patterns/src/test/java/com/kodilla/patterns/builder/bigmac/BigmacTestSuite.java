package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .roll(true)
                .sauce("barbecue")
                .ingredient("cheese")
                .ingredient("Mushrooms")
                .ingredient("becon")
                .burgers(3)
                .build();

        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();

        Assert.assertEquals(4, howManyIngredients);
    }
}