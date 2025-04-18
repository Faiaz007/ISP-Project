package com.isp.faiaz;

import javafx.beans.property.*;
import java.time.LocalDate;

public class Bills {
    private final StringProperty billId = new SimpleStringProperty();
    private final DoubleProperty amount = new SimpleDoubleProperty();
    private final ObjectProperty<LocalDate> dueDate = new SimpleObjectProperty<>();
    private final StringProperty status = new SimpleStringProperty();

    public Bills(String billId, double amount, LocalDate dueDate, String status) {
        this.billId.set(billId);
        this.amount.set(amount);
        this.dueDate.set(dueDate);
        this.status.set(status);
    }



    public String getBillId() { return billId.get(); }
    public double getAmount() { return amount.get(); }
    public LocalDate getDueDate() { return dueDate.get(); }
    public String getStatus() { return status.get(); }

    public void setStatus(String status) { this.status.set(status); }

    public StringProperty billIdProperty() { return billId; }
    public DoubleProperty amountProperty() { return amount; }
    public ObjectProperty<LocalDate> dueDateProperty() { return dueDate; }
    public StringProperty statusProperty() { return status; }
}