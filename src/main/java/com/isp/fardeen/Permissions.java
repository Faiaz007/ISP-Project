package com.isp.fardeen;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Permissions
{
    @javafx.fxml.FXML
    private TableColumn currentPermissionTableColumn;
    @javafx.fxml.FXML
    private Label permissionNotification;
    @javafx.fxml.FXML
    private TableColumn dpTableColumn;
    @javafx.fxml.FXML
    private TableColumn userRoleTableColumn;
    @javafx.fxml.FXML
    private TableView listOfUserTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updatePermissionOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) {
    }
}