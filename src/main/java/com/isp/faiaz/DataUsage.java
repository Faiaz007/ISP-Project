package com.isp.faiaz;

import java.time.LocalDate;

public class DataUsage {
    private String dataUsageId;
    private String planName;
    private LocalDate date;
    private double dataUsed;
    private String timeSlot;

    public DataUsage(String dataUsageId, String planName, LocalDate date, double dataUsed, String timeSlot) {
        this.dataUsageId = dataUsageId;
        this.planName = planName;
        this.date = date;
        this.dataUsed = dataUsed;
        this.timeSlot = timeSlot;
    }

    public String getDataUsageId() {
        return dataUsageId;
    }

    public void setDataUsageId(String dataUsageId) {
        this.dataUsageId = dataUsageId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getDataUsed() {
        return dataUsed;
    }

    public void setDataUsed(double dataUsed) {
        this.dataUsed = dataUsed;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
}
