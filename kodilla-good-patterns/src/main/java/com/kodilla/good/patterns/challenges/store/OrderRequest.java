package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDate;

public class OrderRequest {
    public Product product;
    public User user;
    public LocalDate dateOrder;

    public OrderRequest(Product product, User user, LocalDate dateOrder) {
        this.product = product;
        this.user = user;
        this.dateOrder = dateOrder;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }


}
