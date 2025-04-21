package com.isp.siddique;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CustomerPlanUpgrading {

    @FXML
    private TextField customerIdField;

    @FXML
    private TextField currentPlanField;

    @FXML
    private ComboBox<String> newPlanCombo;

    @FXML
    private Button submitButton;

    @FXML
    private Button previousButton;

    @FXML
    private Button logoutButton;

    @FXML
    public void initialize() {

        newPlanCombo.getItems().addAll("Basic", "Standard", "Premium");

        submitButton.setOnAction(event -> {
            String customerId = customerIdField.getText();
            String currentPlan = currentPlanField.getText();
            String newPlan = newPlanCombo.getValue();

            if (!customerId.isEmpty() && !currentPlan.isEmpty() && newPlan != null) {
                System.out.println("Plan upgrade submitted:");
                System.out.println("Customer ID: " + customerId);
                System.out.println("Current Plan: " + currentPlan);
                System.out.println("New Plan: " + newPlan);

            } else {
                System.out.println("All fields must be filled out.");
            }
        });

        previousButton.setOnAction(event -> {
            System.out.println("Going back to previous screen...");

        });

        logoutButton.setOnAction(event -> {
            System.out.println("Logging out...");

        });
    }
}
