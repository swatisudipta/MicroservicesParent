package com.example.userservice;

import com.example.paymentservice.PaymentService;

public class UserService {
    private OrderService orderService;

    public UserService() {
        this.orderService = new OrderService();
    }

    public void placeOrder(String user) {
        System.out.println("User " + user + " is placing an order.");
        orderService.processOrder(user);
    }
}
