package com.isp.faiaz;

import java.io.Serializable;
import java.time.LocalDate;

public class Bills implements Serializable {

    private final String billId;
    private double amount;
    private final LocalDate dueDate;
    private String status;

    public Bills(String billId, double amount, LocalDate dueDate, String status) {
        this.billId = billId;
        this.amount = amount;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getBillId() {
        return billId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return billId + " | $" + amount + " | Due: " + dueDate + " | Status: " + status;
    }
}
