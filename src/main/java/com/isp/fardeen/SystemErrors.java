package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

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


}