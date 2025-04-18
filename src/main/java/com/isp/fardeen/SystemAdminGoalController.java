package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class SystemAdminGoalController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backupsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void networkOperationsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void removeUserOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addNewUserOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void userActivityOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void errorsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void permissionsOnAction(ActionEvent actionEvent) {
    }
}
package com.isp.fardeen.;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class SystemAdminGoalsController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleAddNewUser(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("AddNewUser.fxml");
    }

    @javafx.fxml.FXML
    public void handleRemoveUser(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("RemoveUser.fxml");
    }

    @javafx.fxml.FXML
    public void handleNetworkOperations(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("NetworkOperations.fxml");
    }

    @javafx.fxml.FXML
    public void handleReports(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Reports.fxml");
    }

    @javafx.fxml.FXML
    public void handlePermissions(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("permissions.fxml");
    }
    @javafx.fxml.FXML
    public void handleUserActivity(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("UserActivity.fxml");
    }
    @javafx.fxml.FXML
    public void handleBackups(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Backups.fxml");
    }
    @javafx.fxml.FXML
    public void handleErrors(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Errors.fxml");
    }
}