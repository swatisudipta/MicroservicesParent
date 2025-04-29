package com.example.paymentservice;

import com.example.notificationservice.NotificationService;

public class PaymentService {
    private NotificationService notificationService;

    public PaymentService() {
        this.notificationService = new NotificationService();
    }

    public void processPayment(String user) {
        System.out.println("Payment processed for " + user);
        notificationService.sendNotification(user, "Payment Successful");
    }
}