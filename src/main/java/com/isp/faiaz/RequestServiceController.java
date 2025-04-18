package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.util.Random;

public class RequestServiceController {

    @FXML
    private ComboBox<String> planType;

    @FXML
    private Label availabilityLabel;

    @FXML
    private ComboBox<String> paymentMethod;

    @FXML
    private Label confirmationMessage;

    @FXML
    public void initialize() {
        // Initialize plan options
        planType.getItems().addAll("Basic", "Standard", "Premium", "Business");
        paymentMethod.getItems().addAll("Bkash", "Nagad", "Credit Card", "Bank Transfer");
    }

    @FXML
    public void checkAvailability(ActionEvent actionEvent) {
        String selectedPlan = planType.getValue();

        if (selectedPlan == null) {
            availabilityLabel.setText("Please select a plan.");
            availabilityLabel.setTextFill(Color.RED);
            return;
        }

        // Simulate availability check
        boolean available = new Random().nextBoolean();

        if (available) {
            availabilityLabel.setText("Service available for plan: " + selectedPlan);
            availabilityLabel.setTextFill(Color.GREEN);
        } else {
            availabilityLabel.setText("Service currently unavailable for this plan.");
            availabilityLabel.setTextFill(Color.RED);
        }
    }

    @FXML
    public void confirmPayment(ActionEvent actionEvent) {
        String selectedPlan = planType.getValue();
        String selectedMethod = paymentMethod.getValue();

        if (selectedPlan == null || selectedMethod == null) {
            confirmationMessage.setText("Please select both plan and payment method.");
            confirmationMessage.setTextFill(Color.RED);
            return;
        }

        // Simulate payment success
        confirmationMessage.setText("Payment successful! Your " + selectedPlan + " plan is now active.");
        confirmationMessage.setTextFill(Color.GREEN);
    }

    @FXML
    public void handleBackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("CustomerGoals.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
