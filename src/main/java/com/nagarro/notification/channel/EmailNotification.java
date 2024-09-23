package com.nagarro.notification.channel;

import com.nagarro.notification.adapter.NotificationAdapter;
import com.nagarro.notification.adapter.EmailNotificationAdapter;
import com.nagarro.notification.strategy.Notification;

public class EmailNotification extends Notification {

    private NotificationAdapter emailAdapter;

    public EmailNotification(String subject, String body) {
        super(subject, body);
        this.emailAdapter = new EmailNotificationAdapter();
    }

    @Override
    public void send(String recipient) {
        emailAdapter.send(recipient, subject, body);
    }
}


