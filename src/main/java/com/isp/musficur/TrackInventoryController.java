package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TrackInventoryController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField equipementTypeTextField;
    @javafx.fxml.FXML
    private TableView inventoryOutputTableView;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void previousButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/inventoryManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void displayButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("faiaz/login-view.fxml");
    }

    @javafx.fxml.FXML
    public void getDataButtonOnAction(ActionEvent actionEvent) {
    }
}