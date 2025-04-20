package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class PayBillsController {
    @FXML
    private TableColumn<Bills, LocalDate> dueDateColumn;
    @FXML
    private TableColumn<Bills, String> statusColumn;
    @FXML
    private TableColumn<Bills, Double> amountColumn;
    @FXML
    private TableColumn<Bills, String> billIdColumn;
    @FXML
    private ComboBox<String> paymentMethodComboBox;
    @FXML
    private TableView<Bills> billsTable;
    @FXML
    private TextField paymentDetails;
    @FXML
    private Label paymentStatus;

    private final ObservableList<Bills> billData = FXCollections.observableArrayList();
    private final ObservableList<Payment> paymentData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        billIdColumn.setCellValueFactory(new PropertyValueFactory<>("billId"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        billData.addAll(
                new Bills("B001", 1200, LocalDate.of(2025, 4, 10), "Pending"),
                new Bills("B002", 500, LocalDate.of(2025, 5, 10), "Payment Done"),
                new Bills("B003", 500, LocalDate.of(2025, 6, 10), "Payment Due")
        );

        billsTable.setItems(billData);
        paymentMethodComboBox.getItems().addAll("Cash", "Debit Card", "Credit Card", "Bkash", "Rocket");
        paymentMethodComboBox.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }

    @FXML
    public void processPaymentButton(ActionEvent actionEvent) {
        Bills selectedBill = billsTable.getSelectionModel().getSelectedItem();
        String method = paymentMethodComboBox.getValue();
        String details = paymentDetails.getText();

        if (selectedBill == null || "Payment Done".equals(selectedBill.getStatus())) {
            paymentStatus.setText("Select a valid unpaid bill.");
            return;
        }

        if (method == null || method.isEmpty() || details == null || details.isEmpty()) {
            paymentStatus.setText("Enter method and details.");
            return;
        }

        if (Math.random() > 0.1) {
            selectedBill.setStatus("Payment Done");
            billsTable.refresh();

            Payment payment = new Payment(selectedBill.getBillId(), selectedBill.getAmount(), 0);
            paymentData.add(payment);
            savePaymentsToFile();
            saveBillsToFile();

            paymentStatus.setText("Payment successful.");
            paymentDetails.clear();
        } else {
            paymentStatus.setText("Payment failed.");
        }
    }

    private void saveBillsToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bills.bin"))) {
            for (Bills b : billData) {
                out.writeObject(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePaymentsToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("payments.bin"))) {
            for (Payment p : paymentData) {
                out.writeObject(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}