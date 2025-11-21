package com.hexa.arch.domain.service;

import com.hexa.arch.domain.dto.FoodOrder;
import com.hexa.arch.domain.port.input.PlaceOrderUsecase;
import com.hexa.arch.domain.port.input.TrackOrderUsecase;
import com.hexa.arch.domain.port.output.OrderRepositoryPort;

public class OrderService implements PlaceOrderUsecase, TrackOrderUsecase {

    private final OrderRepositoryPort orderRepositoryPort;

    public OrderService(OrderRepositoryPort orderRepositoryPort) {
        this.orderRepositoryPort = orderRepositoryPort;
    }

    @Override
    public void placeOrder(FoodOrder order) {
        order.setStatus("ORDER PLACED");
        orderRepositoryPort.saveOrder(order);
    }

    @Override
    public String trackOrder(String orderId) {
        return orderRepositoryPort.findById(orderId);
    }
}
