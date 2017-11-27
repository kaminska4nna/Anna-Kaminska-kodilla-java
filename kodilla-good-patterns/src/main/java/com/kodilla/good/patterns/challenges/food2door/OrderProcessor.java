package com.kodilla.good.patterns.challenges.food2door;


public class OrderProcessor {

    public OrderDTo process(OrderRequest orderRequest) {
        Producer producer = orderRequest.getProducer();
        producer.process(orderRequest);
        return new OrderDTo(orderRequest.getProducer(), orderRequest.getProduct(), true);


    }
}
