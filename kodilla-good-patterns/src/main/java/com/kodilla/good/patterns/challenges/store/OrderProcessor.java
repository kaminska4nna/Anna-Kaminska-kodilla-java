package com.kodilla.good.patterns.challenges.store;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getDateOrder());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getDateOrder());
            return new OrderDTO(orderRequest.getProduct(), orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getProduct(), orderRequest.getUser(), false);

        }

    }
}
