package com.nagarro.notification.service;

public class LegacyEmailService {
    public void sendEmail(String emailAddress, String subject, String body) {
        System.out.println("Sending Email via LegacyEmailService:");
        System.out.println("To: " + emailAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        System.out.println();
    }
}

