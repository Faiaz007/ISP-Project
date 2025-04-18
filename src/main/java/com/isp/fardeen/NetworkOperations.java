package com.isp.fardeen;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class NetworkOperations
{
    @javafx.fxml.FXML
    private Label notificationLabel;
    @javafx.fxml.FXML
    private TableColumn bandwidthUsageTableColumn;
    @javafx.fxml.FXML
    private TableColumn uptimeTableColumn;
    @javafx.fxml.FXML
    private TableView networkStatusTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignIssueOnAction(ActionEvent actionEvent) {
    }
}