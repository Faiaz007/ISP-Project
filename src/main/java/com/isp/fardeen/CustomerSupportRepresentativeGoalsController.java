package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class CustomerSupportRepresentativeGoalsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void billingInquiriesOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Billinginquiries.fxml");
    }

    @javafx.fxml.FXML
    public void scheduleFollowupsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/ScheduleFollowups.fxml");
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void serviceRequestsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/ServiceRequests.fxml");
    }

    @javafx.fxml.FXML
    public void accountsOnAction(ActionEvent actionEvent) throws IOException  {
        SceneSwitcher.switchTo("fardeen/Accounts.fxml");
    }

    @javafx.fxml.FXML
    public void complaintsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Complaints.fxml");
    }

    @javafx.fxml.FXML
    public void interactionOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Interactions.fxml");
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Feedback.fxml");
    }

    @javafx.fxml.FXML
    public void technicalSupportOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/TechnicalSupport.fxml");
    }
}