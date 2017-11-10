package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDate;

public interface OrderService {

    public boolean order(Product product, User user, LocalDate dateOrder);
}
