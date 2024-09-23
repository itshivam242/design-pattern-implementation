package com.nagarro.notification.adapter;

import com.nagarro.notification.service.LegacyEmailService;

public class EmailNotificationAdapter implements NotificationAdapter {

    private LegacyEmailService legacyEmailService;

    public EmailNotificationAdapter() {
        this.legacyEmailService = new LegacyEmailService();
    }

    @Override
    public void send(String recipient,String subject, String messageBody) {
        legacyEmailService.sendEmail(recipient, subject, messageBody);
    }
}

