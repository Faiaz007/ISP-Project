package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class UserActivity
{
    @javafx.fxml.FXML
    private TableColumn actionPerfromedTableColumn;
    @javafx.fxml.FXML
    private TableView activityTableView;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableColumn customerIdTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportLogOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/SystemAdminGoals.fxml");
    }
}