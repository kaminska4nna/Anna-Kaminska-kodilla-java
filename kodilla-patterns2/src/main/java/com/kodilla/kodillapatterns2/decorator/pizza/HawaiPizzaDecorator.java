package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiPizzaDecorator extends AbstractPizzaDecorator {
    public HawaiPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(15));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " + pineapple & ham";
    }
}
