package com.isp.faiaz;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    private Plan plan;
    private double billAmount;
    private boolean hasIssue;
    private boolean suspended;
    private List<Payment> paymentHistory;



    public Customer(String id, String username, String password, int age) {
        super(id, username, password, age);
        this.plan = plan;
        this.billAmount = billAmount;
        this.hasIssue = false;
        this.suspended = false;
        this.paymentHistory = new ArrayList<>();
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public boolean hasIssue() {
        return hasIssue;
    }

    public void setHasIssue(boolean hasIssue) {
        this.hasIssue = hasIssue;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public boolean makePayment(double amount, double discount) {
        if ((amount + discount) >= billAmount) {
            Payment payment = new Payment(this.id, amount, discount);
            paymentHistory.add(payment);
            billAmount = 0;
            return true;
        }
        return false;
    }

    public void reportIssue() {
        this.hasIssue = true;
    }

    public List<Payment> viewBillingHistory() {
        return paymentHistory;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "plan=" + plan +
                ", billAmount=" + billAmount +
                ", hasIssue=" + hasIssue +
                ", suspended=" + suspended +
                ", paymentHistory=" + paymentHistory +
                '}';
    }
}
