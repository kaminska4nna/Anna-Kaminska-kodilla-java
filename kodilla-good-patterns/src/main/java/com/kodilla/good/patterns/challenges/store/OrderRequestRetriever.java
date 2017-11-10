package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrive() {

        Product product = new Product("lipbalm", 4.0);
        User user = new User("Michał Surmacz", "m.surmacz@gmail.com");
        LocalDate dateOrder = LocalDate.of(2017, 01, 10);

        return new OrderRequest(product, user, dateOrder);
    }
}
