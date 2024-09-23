package com.nagarro.notification.channel;

import com.nagarro.notification.adapter.NotificationAdapter;
import com.nagarro.notification.adapter.SMSNotificationAdapter;
import com.nagarro.notification.strategy.Notification;

public class SMSNotification extends Notification {

    private NotificationAdapter smsAdapter;

    public SMSNotification(String subject, String body) {
        super(subject, body);
        this.smsAdapter = new SMSNotificationAdapter();
    }

    @Override
    public void send(String recipient) {
        smsAdapter.send(recipient,subject, body);
    }
}


