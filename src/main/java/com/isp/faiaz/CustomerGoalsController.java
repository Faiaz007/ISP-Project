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

    @javafx.fxml.FXML
    public void handleTrackRequest(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/TrackRequest.fxml");
    }

    @javafx.fxml.FXML
    public void handleSuspension(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/ConnectionSuspension.fxml");
    }

    @javafx.fxml.FXML
    public void handleCustomerSupport(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerCare.fxml");
    }

    @javafx.fxml.FXML
    public void handleChangePlan(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/ChangePlan.fxml");
    }
}