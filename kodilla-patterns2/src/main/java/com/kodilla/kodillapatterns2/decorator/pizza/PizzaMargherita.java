package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMargherita implements PizzaOrder {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15);
    }

    @Override
    public String getPizzaDescription() {
        return "Cheese & tomato sauce";
    }
}
