package com.hexa.arch.domain.port.output;

import com.hexa.arch.domain.dto.FoodOrder;

public interface OrderRepositoryPort {

    void saveOrder(FoodOrder order);
    String findById(String orderId);
}
