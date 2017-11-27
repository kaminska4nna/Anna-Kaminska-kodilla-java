package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Producer extraFoodShop = new ExtraFoodShop();
        Product marchew = new Product("Marchew", 3.00);

        return new OrderRequest(extraFoodShop, marchew, 2);


    }
}
