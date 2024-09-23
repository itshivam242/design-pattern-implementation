package com.nagarro.notification.service;

public class ThirdPartySMSService {
    public void sendSMS(String phoneNumber, String subject, String message) {
        System.out.println("Sending SMS via ThirdPartySMSService:");
        System.out.println("To: " + phoneNumber);
        System.out.println("Message: " + subject + message);
        System.out.println();
    }
}

