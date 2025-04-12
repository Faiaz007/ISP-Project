package com.isp.faiaz;

import java.time.LocalDate;

public class PaymentReminder {
    private String reminderId;
    private String customerId;
    private double dueAmount;
    private String reminderType; // Email or SMS
    private LocalDate sentDate;

    public PaymentReminder() {
        this.sentDate = LocalDate.now();
    }

    public PaymentReminder(String reminderId, String customerId,
                           double dueAmount, String reminderType) {
        this.reminderId = reminderId;
        this.customerId = customerId;
        this.dueAmount = dueAmount;
        this.reminderType = reminderType;
        this.sentDate = LocalDate.now();
    }

    public String getReminderId() {
        return reminderId;
    }

    public void setReminderId(String reminderId) {
        this.reminderId = reminderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getReminderType() {
        return reminderType;
    }

    public void setReminderType(String reminderType) {
        this.reminderType = reminderType;
    }

    public LocalDate getSentDate() {
        return sentDate;
    }

    public void setSentDate(LocalDate sentDate) {
        this.sentDate = sentDate;
    }

    public void sendReminder() {
        // In a real system, this would connect to email/SMS service
        System.out.println("Sending " + reminderType + " reminder to customer: " + customerId);
        System.out.println("Amount due: $" + dueAmount);
    }

    @Override
    public String toString() {
        return "Reminder ID: " + reminderId +
                "\nCustomer ID: " + customerId +
                "\nAmount Due: $" + dueAmount +
                "\nType: " + reminderType +
                "\nSent Date: " + sentDate;
    }
}
