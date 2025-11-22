package com.hexa.arch.adapter.input.rest;

import com.hexa.arch.domain.dto.FoodOrder;
import com.hexa.arch.domain.port.input.PlaceOrderUsecase;
import com.hexa.arch.domain.port.input.TrackOrderUsecase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final PlaceOrderUsecase placeOrderUsecase;
    private final TrackOrderUsecase trackOrderUsecase;

    public OrderController(PlaceOrderUsecase placeOrderUsecase, TrackOrderUsecase trackOrderUsecase) {
        this.placeOrderUsecase = placeOrderUsecase;
        this.trackOrderUsecase = trackOrderUsecase;
    }

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody FoodOrder order) {
        placeOrderUsecase.placeOrder(order);
        return ResponseEntity.ok("Order placed");
    }

    @GetMapping("/track/{orderId}")
    public ResponseEntity<String> trackOrder(@PathVariable String orderId) {
        return ResponseEntity.ok("Status: " + trackOrderUsecase.trackOrder(orderId));
    }
}
