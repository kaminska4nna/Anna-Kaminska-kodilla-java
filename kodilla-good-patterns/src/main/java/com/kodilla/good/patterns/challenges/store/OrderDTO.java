package com.kodilla.good.patterns.challenges.store;

public class OrderDTO {
    public Product product;
    public User user;
    public boolean isOrdered;

    public OrderDTO(Product product, User user, boolean isOrdered) {
        this.product = product;
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
