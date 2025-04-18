package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class CustomerSupportRepresentativeGoalController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void billingInquiriesOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void scheduleFollowupsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void serviceRequestsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void accountsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void complaintsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void interactionOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void feedbackOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void technicalSupportOnAction(ActionEvent actionEvent) {
    }

}

     package com.isp.fardeen.;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class CustomerRepresentativeGoalsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleServiceRequests(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("ServiceRequests.fxml");
    }

    @javafx.fxml.FXML
    public void handleComplaints(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Complaints.fxml");
    }

    @javafx.fxml.FXML
    public void handleTechnicalSupport(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("TechnicalSupport.fxml");
    }

    @javafx.fxml.FXML
    public void handleInteraction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Interaction.fxml");
    }

    @javafx.fxml.FXML
    public void handleScheduleFollowups(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("ScheduleFollowups.fxml");
    }

    @javafx.fxml.FXML
    public void handleFeedback(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Feedback.fxml");
    }

    @javafx.fxml.FXML
    public void handlebillingInquiries(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BillingInquiries.fxml");
    }

    @javafx.fxml.FXML
    public void handleAccounts(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Accounts.fxml");
    }

}