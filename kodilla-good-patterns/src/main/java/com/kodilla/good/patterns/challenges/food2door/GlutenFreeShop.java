package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Producer {
    private final String producerName = "Gluten Free Shop";


    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println(producerName + "got your order");

    }
}
