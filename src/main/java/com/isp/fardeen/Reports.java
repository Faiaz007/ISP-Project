package com.isp.fardeen;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Reports
{
    @javafx.fxml.FXML
    private TableColumn userActivityTableColumn;
    @javafx.fxml.FXML
    private TableView reportTableView;
    @javafx.fxml.FXML
    private ComboBox reportTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn networkPerformanceTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReportOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportOnAction(ActionEvent actionEvent) {
    }
}