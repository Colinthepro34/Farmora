package com.sheryians.major.controller;

import com.sheryians.major.global.GlobalDara;
import com.sheryians.major.model.Order;
import com.sheryians.major.model.Product;
import com.sheryians.major.service.CartService;
import com.sheryians.major.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private CartService cartService;



    @PostMapping("/orderPlaced")
    public ModelAndView placeOrder(
            @ModelAttribute("firstName") String firstName,
            @ModelAttribute("lastName") String lastName,
            @ModelAttribute("email") String email,
            @ModelAttribute("phone") String phone,
            @ModelAttribute("city") String city,
            @ModelAttribute("addressLine1") String addressLine1,
            @ModelAttribute("addressLine2") String addressLine2,
            @ModelAttribute("postcode") String postcode,
            @ModelAttribute("additionalInfo") String additionalInfo) {

        // Log the input values for debugging purposes
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("City: " + city);
        System.out.println("Address Line 1: " + addressLine1);
        System.out.println("Address Line 2: " + addressLine2);
        System.out.println("Postcode: " + postcode);
        System.out.println("Additional Info: " + additionalInfo);

        // Create a new Order object
        Order order = new Order();

        // Set the order details
        order.setFirstName(firstName);
        order.setLastName(lastName);
        order.setEmail(email);
        order.setPhone(phone);
        order.setCity(city);
        order.setAddressLine1(addressLine1);
        order.setAddressLine2(addressLine2);
        order.setPostcode(postcode);
        order.setAdditionalInfo(additionalInfo);

        // Calculate the order amount from the cart
        double totalAmount = GlobalDara.cart.stream().mapToDouble(Product::getPrice).sum();
        order.setAmount(totalAmount);  // Set the calculated amount

        // Save the order to the database
        orderService.saveOrder(order);

        // Redirect to a confirmation page with the order details
        ModelAndView mav = new ModelAndView("orderPlaced");
        mav.addObject("order", order);
        return mav;
    }

}
