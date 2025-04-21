package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class Accounts
{
    @javafx.fxml.FXML
    private TableColumn planTableColumn;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;
    @javafx.fxml.FXML
    private TableView accountTableView;
    @javafx.fxml.FXML
    private TableColumn accountIdTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateAccountOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/CustomerSupportRepresentativeGoals.fxml");
    }
}