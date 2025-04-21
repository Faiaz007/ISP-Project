package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;


public class DashboardController
{

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void handleAdmin(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/SystemAdminGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleInventory(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/inventoryManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void handleSupportRep(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/CustomerSupportRepresentativeGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleMarketing(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/marketingManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void handleNetworkEngineer(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBillingManager(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/BillingManagerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleCustomer(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");


    }

    @javafx.fxml.FXML
    public void handleFieldTechnician(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void handleLogOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/login-view.fxml");
    }
}