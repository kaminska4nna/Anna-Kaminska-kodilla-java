package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDate;

public class ProductService implements OrderService {
    @Override
    public boolean order(Product product, User user, LocalDate dateOrder) {
        System.out.println("Product: " + product.getProductName() + " , ordered by: " + user.getName() + " " + user.getName()
                + ". Date of order: " + dateOrder.toString());

        return true;
    }
}
