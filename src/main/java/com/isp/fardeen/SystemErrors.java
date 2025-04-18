package com.isp.fardeen;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SystemErrors
{
    @javafx.fxml.FXML
    private TableView errorTableView;
    @javafx.fxml.FXML
    private TableColumn reportedErrorsTableColumn;
    @javafx.fxml.FXML
    private Label errorNotificationLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void resolveErrorOnAction(ActionEvent actionEvent) {
    }
}