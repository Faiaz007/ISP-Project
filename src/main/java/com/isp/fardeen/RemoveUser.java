package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class RemoveUser
{
    @javafx.fxml.FXML
    private TableColumn inactiveUserTableColumn;
    @javafx.fxml.FXML
    private TableView inactiveUserTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void removeUserOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/SystemAdminGoals.fxml");
    }
}