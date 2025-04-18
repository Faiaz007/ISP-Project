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
        SceneSwitcher.switchTo("Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void openPaymentTrackerView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("TrackPayments.fxml");
    }

    @javafx.fxml.FXML
    public void openReportView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("GenerateReport.fxml");
    }

    @javafx.fxml.FXML
    public void openBillGeneratorView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("GenerateBills.fxml");
    }

    @javafx.fxml.FXML
    public void openReminderView(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("SendReminder.fxml");
    }
}