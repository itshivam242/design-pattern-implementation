package com.nagarro.notification.observer;

import com.nagarro.notification.model.User;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private static NotificationService instance;
    private List<User> subscribers;
    private NotificationService() {
        subscribers = new ArrayList<>();
    }
    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void subscribe(User user) {
        subscribers.add(user);
    }

    public void unsubscribe(User user) {
        subscribers.remove(user);
    }

    public List<User> getSubscribers() {
        return subscribers;
    }
}


