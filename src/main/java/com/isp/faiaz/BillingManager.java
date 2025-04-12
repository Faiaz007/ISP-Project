package com.isp.faiaz;

import java.util.ArrayList;
import java.util.List;


public class BillingManager extends Person {
    private List<Customer> customers;
    private List<Payment> payments;
    private List<BillingReport> reports; // This is declared but not initialized in constructor

    public BillingManager(String id, String username, String password, int age) {
        super(id, username, password, age);
        this.customers = new ArrayList<>();
        this.payments = new ArrayList<>();
        this.reports = new ArrayList<>(); // Initialize the reports list
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void processPayment(String customerId, double amount) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            Payment payment = new Payment(customerId, amount, 0);
            payments.add(payment);
            customer.setBillAmount(customer.getBillAmount() - amount);
        }
    }

    public void applyLateFee(String customerId) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            double lateFee = customer.getBillAmount() * 0.10;
            customer.setBillAmount(customer.getBillAmount() + lateFee);
        }
    }

    public void applyDiscount(String customerId, double discount) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            customer.setBillAmount(customer.getBillAmount() - discount);
        }
    }

    public void resolveIssue(String customerId) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            customer.setHasIssue(false);
        }
    }

    public double getTotalRevenue() {
        double total = 0;
        for (Payment payment : payments) {
            total += payment.getAmount();
        }
        return total;
    }

    @Override
    public String toString() {
        return "BillingManager{" +
                "customers=" + customers +
                ", payments=" + payments +
                ", reports=" + reports + // Added reports to toString
                '}';
    }


}