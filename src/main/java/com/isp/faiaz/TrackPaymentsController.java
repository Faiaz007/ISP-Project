package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class TrackPaymentsController
{
    @javafx.fxml.FXML
    private TableView<Payment> paymentTable;
    @javafx.fxml.FXML
    private TableColumn <Payment, String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<Payment, String>  paymentIdColumn;
    @javafx.fxml.FXML
    private TableColumn <Payment, LocalDate>dateColumn;
    @javafx.fxml.FXML
    private TableColumn <Payment, String> customerIdColumn;
    private final ObservableList<Payment> payments = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField searchField;

    @javafx.fxml.FXML
    public void initialize() {
        paymentIdColumn.setCellValueFactory(new PropertyValueFactory<>("paymentId"));
        customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("paymentDate"));
        statusColumn.setCellValueFactory(cell -> new ReadOnlyStringWrapper(
                cell.getValue().isRefunded() ? "Refunded" : "Completed"));
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BillingManagerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void loadFromFile(ActionEvent actionEvent) {
        payments.clear();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("payments.bin"))) {
            while (true) {
                Payment p = (Payment) in.readObject();
                payments.add(p);
            }
        } catch (EOFException e) {
            messageLabel.setText("Payments loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            messageLabel.setText("Error loading payments.");
        }
    }

    @javafx.fxml.FXML
    public void saveToFile(ActionEvent actionEvent) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("payments.bin"))) {
            for (Payment p : payments) {
                out.writeObject(p);
            }
            messageLabel.setText("Payments saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            messageLabel.setText("Error saving payments.");
        }
    }

    @javafx.fxml.FXML
    public void filterPayments(ActionEvent actionEvent) {
        try {
        messageLabel.setText("");
        String query = searchField.getText().toLowerCase();
        if (query.isEmpty()) {
            paymentTable.setItems(payments);
            return;
        }
        ObservableList<Payment> filtered = FXCollections.observableArrayList();
        for (Payment p : payments) {
            if (p.getCustomerId().toLowerCase().contains(query)) {
                filtered.add(p);
            }
        }
        paymentTable.setItems(filtered);
    } catch (Exception e) {
        messageLabel.setText("Invalid input for filter!");}
    }
}