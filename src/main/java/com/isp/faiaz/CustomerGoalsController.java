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
    public void handleDataUsage(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReportIssue(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlePayBills(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRequestService(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Dashboard.fxml");
    }
}