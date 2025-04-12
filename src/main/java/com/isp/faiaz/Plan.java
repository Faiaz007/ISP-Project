package com.isp.faiaz;

public class Plan {
    private String planId;
    private String name;
    private int speed;
    private double price;

    public Plan() {
    }

    public Plan(String planId, String name, int speed, double price) {
        this.planId = planId;
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlanDetails() {
        return "Plan: " + name + "\nSpeed: " + speed + " Mbps\nPrice: $" + price;
    }

    @Override
    public String toString() {
        return name + " - " + speed + " Mbps - $" + price;
    }
}

