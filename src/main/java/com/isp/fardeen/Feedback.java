package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class Feedback
{
    @javafx.fxml.FXML
    private TableColumn feedbackIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn feedbackTableColumn;
    @javafx.fxml.FXML
    private TableView feedbackTableView;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void respondOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/CustomerSupportRepresentativeGoals.fxml");
    }
}