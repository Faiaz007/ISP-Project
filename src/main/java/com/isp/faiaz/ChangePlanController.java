package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ChangePlanController
{
    @javafx.fxml.FXML
    private ComboBox<Plan> currentPlanComboBox;
    @javafx.fxml.FXML
    private TextField userIdField;
    @javafx.fxml.FXML
    private ComboBox<Plan>  planComboBox;
    @javafx.fxml.FXML
    private Label eligibilityLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    private List<Plan> availablePlans;

    @javafx.fxml.FXML
    public void initialize() {
        availablePlans = Arrays.asList(
                new Plan("P1", "Basic", 20, 20.0),
                new Plan("P2", "Standard", 50, 40.0),
                new Plan("P3", "Premium", 100, 70.0),
                new Plan("P4", "Unlimited", 200, 100.0)
        );
        currentPlanComboBox.getItems().addAll(availablePlans);
        planComboBox.getItems().addAll(availablePlans);
        currentPlanComboBox.setValue(availablePlans.getFirst());

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleConfirmChange(ActionEvent actionEvent) {
        String userId = userIdField.getText();
        Plan selectedPlan = planComboBox.getValue();
        Plan currentPlan = currentPlanComboBox.getValue();

        if (userId.isEmpty()) {
            statusLabel.setText("Please enter your User ID.");
            return;
        }

        if (selectedPlan == null || selectedPlan.getPlanId().equals(currentPlan.getPlanId())) {
            statusLabel.setText("Invalid plan selection.");
            return;
        }
        currentPlanComboBox.setValue(selectedPlan);
        eligibilityLabel.setText("");
        statusLabel.setText("Plan changed to " + selectedPlan.getName()
                + ". Payment processed. New bill: $" + selectedPlan.getPrice());
    }

    @javafx.fxml.FXML
    public void handleValidate(ActionEvent actionEvent) {
        Plan selectedPlan = planComboBox.getValue();
        Plan currentPlan = currentPlanComboBox.getValue();

        if (selectedPlan == null) {
            eligibilityLabel.setText("Please select a new plan.");
        } else if (selectedPlan.getPlanId().equals(currentPlan.getPlanId())) {
            eligibilityLabel.setText("You are already on this plan.");
        } else {
            eligibilityLabel.setText("You are eligible to switch.");
        }

    }
}