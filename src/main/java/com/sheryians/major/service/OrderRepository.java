package com.sheryians.major.service;  // Ensure the correct package name

import com.sheryians.major.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // JpaRepository already provides standard CRUD methods (save, findAll, findById, delete, etc.)

    // Additional custom query methods can be defined here if needed
}
