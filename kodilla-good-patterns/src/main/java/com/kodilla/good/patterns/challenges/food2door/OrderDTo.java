package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTo {
    private Producer producer;
    private Product product;
    private boolean isOrdered;

    public OrderDTo(Producer producer, Product product, boolean isOrdered) {
        this.producer = producer;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}


