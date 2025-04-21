package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class SystemAdminGoalsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backupsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Backups.fxml");
    }

    @javafx.fxml.FXML
    public void networkOperationsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/NetworkOperations.fxml");
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void removeUserOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/RemoveUser.fxml");
    }

    @javafx.fxml.FXML
    public void addNewUserOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/AddNewUser.fxml");
    }

    @javafx.fxml.FXML
    public void userActivityOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/UserActivity.fxml");
    }

    @javafx.fxml.FXML
    public void reportsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Reports.fxml");
    }

    @javafx.fxml.FXML
    public void errorsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Errors.fxml");
    }

    @javafx.fxml.FXML
    public void permissionsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/Permissions.fxml");
    }
}