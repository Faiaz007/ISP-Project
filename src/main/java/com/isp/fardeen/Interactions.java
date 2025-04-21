package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class Interactions
{
    @javafx.fxml.FXML
    private TableColumn interactionIdTableColumn;
    @javafx.fxml.FXML
    private TableView interactionsTableView;
    @javafx.fxml.FXML
    private TableColumn typeTableColumn;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void exportLogOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/CustomerSupportRepresentativeGoals.fxml");
    }
}