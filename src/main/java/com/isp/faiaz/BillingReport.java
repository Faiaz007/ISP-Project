package com.isp.faiaz;
import java.time.LocalDate;
public class BillingReport {
    private String reportId;
    private String reportType;
    private double totalRevenue;
    private LocalDate generatedDate;

    public BillingReport() {
        this.generatedDate = LocalDate.now();
    }

    public BillingReport(String reportId, String reportType, double totalRevenue) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.totalRevenue = totalRevenue;
        this.generatedDate = LocalDate.now();
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    public void generateReport() {
        System.out.println("Generating " + reportType + " report: " + reportId);
    }

    public void exportReport() {
        System.out.println("Exporting report: " + reportId);
    }

    @Override
    public String toString() {
        return "BillingReport{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", totalRevenue=" + totalRevenue +
                ", generatedDate=" + generatedDate +
                '}';
    }
}
