# Notification System

This project is a Notification System built using plain Java, designed to send notifications via Email and SMS. It follows key design patterns to ensure the system is flexible, scalable, and maintainable. The system can easily integrate new notification channels in the future, adhering to the Open/Closed Principle.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
### Prerequisites
Make sure the following software is installed:
- Maven
- Java 17

### Installing
A step-by-step series of instructions to get the development environment running.

#### 1. Create a project folder and clone the Notification System repository
```bash
mkdir notification-system && cd notification-system
git clone https://github.com/itshivam242/design-pattern-implementation.git ./

```
#### 2. Compile the Project
```bash
mvn clean compile
```
#### 3. Run the Application
Run the Main.java file from IDE to simulate the notification system

## Design Patterns Used
This project follows several important design patterns to ensure its flexibility and scalability:

### 1. Factory Pattern

Used in NotificationFactory to create appropriate notification objects (Email or SMS).
### 2. Singleton Pattern

Implemented in NotificationService to manage subscribers and ensure only one instance of the service.
### 3. Adapter Pattern

Used in EmailNotificationAdapter and SMSNotificationAdapter to adapt legacy services to the current notification structure.
### 4. Facade Pattern

The NotificationFacade simplifies the process of sending notifications by abstracting underlying complexity.
### 5. Strategy Pattern

The Notification class serves as the base strategy, with EmailNotification and SMSNotification implementing different strategies for each channel.
### 6. Observer (PubSub) Pattern

Used to manage a list of subscribers in the NotificationService. When a notification is sent, all subscribed users are notified.