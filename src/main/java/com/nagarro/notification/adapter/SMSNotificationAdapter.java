package com.nagarro.notification.adapter;

import com.nagarro.notification.service.ThirdPartySMSService;

public class SMSNotificationAdapter implements NotificationAdapter {

    private ThirdPartySMSService thirdPartySMSService;

    public SMSNotificationAdapter() {
        this.thirdPartySMSService = new ThirdPartySMSService();
    }

    @Override
    public void send(String recipient, String subject, String messageBody) {
        thirdPartySMSService.sendSMS(recipient, subject, messageBody);
    }
}

