package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Producer {
    public final String producentName = "Healthy Shop";


    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Thank you for order from " + producentName);
    }
}
