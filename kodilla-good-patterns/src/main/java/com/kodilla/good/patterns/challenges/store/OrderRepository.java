package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDate;

public interface OrderRepository {
    public void createOrder(Product product, User user, LocalDate dateOrder);
}
