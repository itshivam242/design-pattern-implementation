package com.nagarro.notification.factory;

import com.nagarro.notification.channel.EmailNotification;
import com.nagarro.notification.strategy.Notification;
import com.nagarro.notification.channel.NotificationChannel;
import com.nagarro.notification.channel.SMSNotification;

public class NotificationFactory {
    public static Notification createNotification(NotificationChannel channel, String subject, String body) {
        switch (channel) {
            case EMAIL:
                return new EmailNotification(subject, body);
            case SMS:
                return new SMSNotification(subject, body);
            default:
                throw new IllegalArgumentException("Invalid notification channel");
        }
    }
}

