package com.isp.faiaz;
import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;


public class DashboardController
{

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void handleAdmin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleInventory(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("inventoryManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void handleSupportRep(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarketing(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("marketingManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void handleNetworkEngineer(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBillingManager(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCustomer(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("CustomerGoals.fxml");


    }

    @javafx.fxml.FXML
    public void handleFieldTechnician(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void handleLogOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login-view.fxml");
    }
}