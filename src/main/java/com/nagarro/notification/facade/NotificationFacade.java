package com.nagarro.notification.facade;

import com.nagarro.notification.strategy.Notification;
import com.nagarro.notification.channel.NotificationChannel;
import com.nagarro.notification.observer.NotificationService;
import com.nagarro.notification.model.User;
import com.nagarro.notification.factory.NotificationFactory;

public class NotificationFacade {

    private NotificationService notificationService;

    public NotificationFacade() {
        this.notificationService = NotificationService.getInstance();
    }

    public void sendNotification(NotificationChannel channel, String subject, String body) {
        Notification notification = NotificationFactory.createNotification(channel, subject, body);

        for (User user : notificationService.getSubscribers()) {
            if (channel == NotificationChannel.EMAIL && user.getEmail() != null) {
                notification.send(user.getEmail());
            } else if (channel == NotificationChannel.SMS && user.getPhone() != null) {
                notification.send(user.getPhone());
            } else {
                System.out.println("User " + user.getName() + " is not subscribed to " + channel + " notifications.");
                System.out.println();
            }
        }
    }

    public void addSubscriber(User user) {
        notificationService.subscribe(user);
    }

    public void removeSubscriber(User user) {
        notificationService.unsubscribe(user);
    }
}



