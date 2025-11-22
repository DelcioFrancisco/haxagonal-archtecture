package com.hexa.arch.adapter.output.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Data
public class OrderEntity {

    @Id
    private String orderId;

    private String restaurantName;
    private String item;
    private String customerName;
    private String status;

}
