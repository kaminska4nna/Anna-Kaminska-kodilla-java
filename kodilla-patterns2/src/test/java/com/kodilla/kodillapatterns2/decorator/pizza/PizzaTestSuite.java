package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {
    @Test
    public void testPizzaMargheritaGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testPizzaMargheritaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();

        //When
        String description = pizzaOrder.getPizzaDescription();

        //Then
        assertEquals("Cheese & tomato sauce", description);
    }

    @Test
    public void testHawaiPizzaGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new HawaiPizzaDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(30), price);
    }

    @Test
    public void testPepperoniPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PepperoniPizzaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getPizzaDescription();
        //Then
        assertEquals("Cheese & tomato sauce + pepperoni & onion", description);
    }

    @Test
    public void testPizzaAmericanaAdditionalCheeseGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new HawaiPizzaDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getPrice();

        //Then
        assertEquals(new BigDecimal(34), price);
    }

    @Test
    public void testHawaiPizzaExtraCheeseGetPizzaDescription() {
        //Given
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new HawaiPizzaDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        String description = pizzaOrder.getPizzaDescription();

        //Then
        assertEquals("Cheese & tomato sauce + pineapple & ham + extra cheese", description);
    }
}
