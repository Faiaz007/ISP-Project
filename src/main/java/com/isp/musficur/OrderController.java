package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class OrderController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private Label orderOutputLabel;
    @javafx.fxml.FXML
    private TextField supplierTextField;
    @javafx.fxml.FXML
    private TextField equipmentDetailsTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void placeOrderButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void previousButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/inventoryManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("faiaz/login-view.fxml");
    }
}