package com.sheryians.major.service;

import com.sheryians.major.model.Order;
import com.sheryians.major.service.OrderRepository;  // Correct import for OrderRepository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;  // Injecting the OrderRepository

    // Save the order to the database
    public void saveOrder(Order order) {
        // Log the order details for debugging (optional)
        System.out.println("Saving order with details:");
        System.out.println("First Name: " + order.getFirstName());
        System.out.println("Last Name: " + order.getLastName());
        System.out.println("Email: " + order.getEmail());
        System.out.println("Phone: " + order.getPhone());
        System.out.println("City: " + order.getCity());
        System.out.println("Address Line 1: " + order.getAddressLine1());
        System.out.println("Address Line 2: " + order.getAddressLine2());
        System.out.println("Postcode: " + order.getPostcode());
        System.out.println("Additional Info: " + order.getAdditionalInfo());
        System.out.println("Amount: " + order.getAmount());

        // Save the order to the database using the repository
        orderRepository.save(order);
    }
}
