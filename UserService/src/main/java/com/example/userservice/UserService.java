package com.example.userservice;

import com.example.paymentservice.PaymentService;

public class UserService {
    private PaymentService paymentService;

    public UserService() {
        this.paymentService = new PaymentService();
    }

    public void placeOrder(String user) {
        System.out.println("User " + user + " is placing an order.");
        paymentService.processOrder(user);
    }
}
