package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizzaDecorator extends AbstractPizzaDecorator {
    public PepperoniPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " + pepperoni & onion";
    }
}

