package com.example.notificationservice;

public class NotificationService {
    public void sendNotification(String user, String message) {
        System.out.println("Sending notification to " + user + ": " + message);
    }
}