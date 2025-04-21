package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EquipmentDistributionController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private Label equipmentDistributionOutputLabel;
    @javafx.fxml.FXML
    private TextField technicianDetailsTextField;
    @javafx.fxml.FXML
    private TextField equipmentDetailsTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateButtonOnAction(ActionEvent actionEvent) {
        if (idTextField.getText().trim().isEmpty()){
            equipmentDistributionOutputLabel.setText(("Enter a  ID to Continue"));
            return;
        }
        if (technicianDetailsTextField.getText().trim().isEmpty()) {
            equipmentDistributionOutputLabel.setText(("Enter a technician details to Continue"));
            return;
        }
        if (equipmentDetailsTextField.getText().trim().isEmpty()) {
            equipmentDistributionOutputLabel.setText(("Enter any preferences to Continue"));
            return;
        }

        equipmentDistributionOutputLabel.setText("Updated and assign to Technician.");
    }

    @javafx.fxml.FXML
    public void previousButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/inventoryManagerDashboard.fxml");
    }
}