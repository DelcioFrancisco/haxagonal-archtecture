package com.hexa.arch.domain.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "foodorder")
@Data
public class FoodOrder {
    @Id
    private String orderId;

    private String restaurantName;
    private String customerName;
    private String item;
    private String status;
}
