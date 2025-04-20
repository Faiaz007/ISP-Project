package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class CustomerGoalsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleDataUsage(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/DataUsage.fxml");
    }

    @javafx.fxml.FXML
    public void handleReportIssue(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/ReportIssue.fxml");
    }

    @javafx.fxml.FXML
    public void handlePayBills(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/PayBills.fxml");
    }

    @javafx.fxml.FXML
    public void handleRequestService(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/RequestService.fxml");

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/Dashboard.fxml");
    }
}