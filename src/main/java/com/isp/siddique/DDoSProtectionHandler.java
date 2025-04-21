package com.isp.siddique;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DDoSProtectionHandler {
    @FXML
    private CheckBox enableProtectionCheckBox;

    @FXML
    private TextField ipAddressField;

    @FXML
    private TextField trafficThresholdField;

    @FXML
    private Button startProtectionButton;

    @FXML
    private Label statusLabel;

    @FXML
    private void initialize() {
        statusLabel.setText("Protection not started.");
        startProtectionButton.setDisable(true);

        enableProtectionCheckBox.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            startProtectionButton.setDisable(!isNowSelected);
        });
    }

    @FXML
    private void handleStartProtection() {
        String ipAddress = ipAddressField.getText();
        String threshold = trafficThresholdField.getText();

        if (ipAddress.isEmpty() || threshold.isEmpty()) {
            statusLabel.setText("Please fill all fields.");
            return;
        }

        // Start protection logic here
        statusLabel.setText("Protection started for IP: " + ipAddress + " with threshold: " + threshold + " Mbps");
        System.out.println("DDoS Protection Started on " + ipAddress + " with threshold " + threshold + " Mbps.");
    }
}

