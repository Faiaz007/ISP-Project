package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class Complaints
{
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn customeTableColumn;
    @javafx.fxml.FXML
    private TableColumn complaintIDTableColumn;
    @javafx.fxml.FXML
    private TableView complaintsTableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void resolveComplaintOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/CustomerSupportRepresentativeGoals.fxml");
    }
}