package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InventoryRecordsController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField typeTextField;
    @javafx.fxml.FXML
    private TextField modelTextField;
    @javafx.fxml.FXML
    private Label inventoryRecordOutputLabel;
    @javafx.fxml.FXML
    private TableView InventoryOutputTableView;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateInventoryButtonOnAction(ActionEvent actionEvent) {
        if (idTextField.getText().trim().isEmpty()){
            inventoryRecordOutputLabel.setText(("Enter a  ID to Continue"));
            return;
        }
        if (typeTextField.getText().trim().isEmpty()) {
            inventoryRecordOutputLabel.setText(("Enter type to Continue"));
            return;
        }
        if (modelTextField.getText().trim().isEmpty()) {
            inventoryRecordOutputLabel.setText(("Enter any model to Continue"));
            return;
        }
        if (quantityTextField.getText().trim().isEmpty()) {
            inventoryRecordOutputLabel.setText(("Enter quantity to Continue"));
            return;
        }


        inventoryRecordOutputLabel.setText("Inventory record Successful");
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