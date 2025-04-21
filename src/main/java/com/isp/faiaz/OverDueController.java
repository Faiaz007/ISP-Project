package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class OverDueController {
    @FXML
    private TableColumn<Payment, Double> dueDateColumn;
    @FXML
    private Label titleLabel;
    @FXML
    private TableView<Payment> overdueTable;
    @FXML
    private TableColumn<Payment, Double> amountColumn;
    @FXML
    private TableColumn<Payment, String> customerIdColumn;
    @FXML
    private Label statusLabel;

    private final ObservableList<Payment> overduePayments = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        loadOverduePayments();
        overdueTable.setItems(overduePayments);
    }

    @FXML
    public void handleBack(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/BillingManagerGoals.fxml");
    }

    @FXML
    public void handleSendReminder(ActionEvent actionEvent) {
        Payment selected = overdueTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            statusLabel.setText("Reminder sent to Customer ID: " + selected.getCustomerId());
        } else {
            statusLabel.setText("No customer selected.");
        }
    }

    @FXML
    public void handleMarkAsPaid(ActionEvent actionEvent) {
        Payment selected = overdueTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            overduePayments.remove(selected);
            statusLabel.setText("Marked as paid for Customer ID: " + selected.getCustomerId());
        } else {
            statusLabel.setText("No customer selected.");
        }
    }

    private void loadOverduePayments() {
        overduePayments.addAll(
                new Payment("C001", 850.0, 0.0),
                new Payment("C002", 1200.0, 0.0)
        );
    }
}