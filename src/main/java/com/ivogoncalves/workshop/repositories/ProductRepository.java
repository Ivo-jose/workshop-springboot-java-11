package com.ivogoncalves.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivogoncalves.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
