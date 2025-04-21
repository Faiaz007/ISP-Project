package com.isp.fardeen;

import java.time.LocalDate;

public class User {
    private int customerId;
    private boolean actionPerformed;
    private LocalDate datePicker;

    public User(int customerId, boolean actionPerformed, LocalDate datePicker) {
        this.customerId = customerId;
        this.actionPerformed = actionPerformed;
        this.datePicker = datePicker;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public boolean isActionPerformed() {
        return actionPerformed;
    }

    public void setActionPerformed(boolean actionPerformed) {
        this.actionPerformed = actionPerformed;
    }

    public LocalDate getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(LocalDate datePicker) {
        this.datePicker = datePicker;
    }

    @Override
    public String toString() {
        return "User{" +
                "customerId=" + customerId +
                ", actionPerformed=" + actionPerformed +
                ", datePicker=" + datePicker +
                '}';
    }
}
