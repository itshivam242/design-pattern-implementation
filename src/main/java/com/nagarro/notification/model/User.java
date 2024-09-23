package com.nagarro.notification.model;

public class User {
    private String name;
    private String email;
    private String phone;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public User(String name, String emailOrPhone, boolean isEmail) {
        this.name = name;
        if (isEmail) {
            this.email = emailOrPhone;
            this.phone = null;
        } else {
            this.phone = emailOrPhone;
            this.email = null;
        }
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}


