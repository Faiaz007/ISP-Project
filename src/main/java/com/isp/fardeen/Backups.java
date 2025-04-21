package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.io.IOException;

public class Backups
{
    @javafx.fxml.FXML
    private DatePicker backupSchedulerDatePicker;
    @javafx.fxml.FXML
    private Label backupConfirmationLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void manualBackupOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void scheduleBackupOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/SystemAdminGoals.fxml");
    }
}