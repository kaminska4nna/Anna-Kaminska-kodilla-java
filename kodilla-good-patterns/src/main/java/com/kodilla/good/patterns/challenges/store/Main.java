package com.kodilla.good.patterns.challenges.store;

public class Main {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(), new ProductService(), new ProductRepository());
        orderProcessor.process(orderRequest);
    }
}
