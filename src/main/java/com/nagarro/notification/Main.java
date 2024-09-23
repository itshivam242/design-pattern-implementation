package com.nagarro.notification;

import com.nagarro.notification.channel.NotificationChannel;
import com.nagarro.notification.facade.NotificationFacade;
import com.nagarro.notification.model.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Amit Rathi", "ar@abc.com", "7890123456");
        User user2 = new User("Mohit Sangwan", "ms@abc.com", true);
        User user3 = new User("Rohan Tomar", "9837667788", false);

        NotificationFacade facade = new NotificationFacade();
        facade.addSubscriber(user1);
        facade.addSubscriber(user2);
        facade.addSubscriber(user3);

        facade.sendNotification(NotificationChannel.EMAIL, "Benefits on your Bank Card", "An array of offers.");

        facade.sendNotification(NotificationChannel.SMS, "Important Information:", " You have access to FREE Netflix on your Number.");

        facade.sendNotification(NotificationChannel.SMS, "", " You have access to FREE Netflix on your Number.");
    }
}
