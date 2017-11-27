package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private Producer producer;
    private Product product;
    private int quantity;

    public OrderRequest(Producer producer, Product product, int quantity) {
        this.producer = producer;
        this.product = product;
        this.quantity = quantity;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "producer=" + producer +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
