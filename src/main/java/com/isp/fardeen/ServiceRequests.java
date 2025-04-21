package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ServiceRequests
{
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn requestIdTableColumn;
    @javafx.fxml.FXML
    private TableView serviceRequestsTableView;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/CustomerSupportRepresentativeGoals.fxml");
    }
}