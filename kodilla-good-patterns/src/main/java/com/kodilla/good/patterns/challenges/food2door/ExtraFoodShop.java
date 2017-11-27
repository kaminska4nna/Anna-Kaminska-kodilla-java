package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Producer {
    private final String producerName = "Extra Food Shop";

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Order placed in " + producerName);

    }
}
