package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MarketingManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void advertisementButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CustomerNeedsButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("customerNeeds.fxml");
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login-view.fxml");
    }

    @javafx.fxml.FXML
    public void colaborationButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void promotionalOfferButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void marketingPlanButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("marketingPlan.fxml");
    }

    @javafx.fxml.FXML
    public void marketingPreferencesButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void marketingReportButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("marketingReport");
    }

    @javafx.fxml.FXML
    public void campaignSuccessButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("campaign.fxml");
    }
}