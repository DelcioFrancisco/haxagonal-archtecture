package com.hexa.arch.domain.port.input;

import com.hexa.arch.domain.dto.FoodOrder;

public interface PlaceOrderUsecase {

    void placeOrder(FoodOrder order);
}
