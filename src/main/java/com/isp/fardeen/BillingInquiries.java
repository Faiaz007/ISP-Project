package com.isp.fardeen;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BillingInquiries
{
    @javafx.fxml.FXML
    private TableView billingTableView;
    @javafx.fxml.FXML
    private TableColumn amountTableColumn;
    @javafx.fxml.FXML
    private TableColumn inquiryIdTablceColumn;
    @javafx.fxml.FXML
    private TableColumn customerTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void handleResolveBilling(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void resolveInquiryOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goBackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("fardeen/CustomerSupportRepresentativeGoals.fxml");
    }
}