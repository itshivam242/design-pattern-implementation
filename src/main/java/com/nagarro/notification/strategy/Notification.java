package com.nagarro.notification.strategy;

public abstract class Notification {
    protected String subject;
    protected String body;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public abstract void send(String to);
}

