package com.ivogoncalves.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivogoncalves.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
