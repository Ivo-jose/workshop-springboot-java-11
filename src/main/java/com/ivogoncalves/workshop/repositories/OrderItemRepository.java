package com.ivogoncalves.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivogoncalves.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
