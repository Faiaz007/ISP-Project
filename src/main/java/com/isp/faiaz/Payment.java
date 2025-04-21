package com.isp.faiaz;

import java.io.Serializable;
import java.time.LocalDate;

public class Payment implements Serializable {
    private String paymentId;
    private String customerId;
    private double amount;
    private LocalDate paymentDate;
    private double lateFee;
    private boolean isRefunded;

    public Payment() {
        this.paymentId = generatePaymentId();
        this.paymentDate = LocalDate.now();
        this.isRefunded = false;
    }

    public Payment(String customerId, double amount, double lateFee) {
        this.paymentId = generatePaymentId();
        this.customerId = customerId;
        this.amount = amount;
        this.paymentDate = LocalDate.now();
        this.lateFee = lateFee;
        this.isRefunded = false;
    }
    private String generatePaymentId() {
        return "PAY-" + (int)(Math.random() * 1000000);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public boolean isRefunded() {
        return isRefunded;
    }

    public void setRefunded(boolean refunded) {
        isRefunded = refunded;
    }





    public boolean processPayment() {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return false;
        }
        this.paymentDate = LocalDate.now();
        this.isRefunded = false;
        System.out.println("Payment processed successfully"+ this.paymentDate+ ".");
        return true;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentId +
                "\nCustomer ID: " + customerId +
                "\nAmount: $" + amount +
                "\nDate: " + paymentDate +
                "\nLate Fee: $" + lateFee +
                "\nStatus: " + (isRefunded ? "Refunded" : "Completed");
    }
}
