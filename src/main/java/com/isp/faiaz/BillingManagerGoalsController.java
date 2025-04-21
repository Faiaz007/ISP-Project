package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class BillingManagerGoalsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void openPaymentTrackerView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/TrackPayments.fxml");
    }

    @javafx.fxml.FXML
    public void openReportView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/GenerateReport.fxml");
    }

    @javafx.fxml.FXML
    public void openBillGeneratorView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/GenerateBills.fxml");
    }

    @javafx.fxml.FXML
    public void openReminderView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/SendReminder.fxml");
    }

    @javafx.fxml.FXML
    public void openRefundAndDiscount(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/RefundsDiscount.fxml");
    }

    @javafx.fxml.FXML
    public void openOverduePayment(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/OverDue.fxml");
    }
}