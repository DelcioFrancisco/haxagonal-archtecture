package com.hexa.arch.adapter.output.repository;

import com.hexa.arch.adapter.output.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, String> {
}
