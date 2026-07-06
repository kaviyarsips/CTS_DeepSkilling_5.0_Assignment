package com.cognizant.decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Email Notification:");

        notifier.send("Welcome!");

        System.out.println();

        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS Notification:");

        smsNotifier.send("Payment Successful!");

        System.out.println();

        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        System.out.println("Email + SMS + Slack Notification:");

        allNotifier.send("Server is Running Successfully!");

    }

}