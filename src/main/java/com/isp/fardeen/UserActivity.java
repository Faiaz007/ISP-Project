package com.isp.fardeen;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UserActivity
{
    @javafx.fxml.FXML
    private TableColumn actionPerfromedTableColumn;
    @javafx.fxml.FXML
    private TableView activityTableView;
    @javafx.fxml.FXML
    private TableColumn loginTableColumn;
    @javafx.fxml.FXML
    private TextField filterByUseOrDateTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportLogOnAction(ActionEvent actionEvent) {
    }
}