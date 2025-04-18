package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class InventoryManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void equipmentDistributionButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifyTechnicianButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateInventoryReportsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void orderEquipmentButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login-view.fxml");
    }

    @javafx.fxml.FXML
    public void equipmentReturnButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void conductAuditsButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void inventoryLevelButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void inventoryRecordButtonOnAction(ActionEvent actionEvent) {
    }
}