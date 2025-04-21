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
import java.util.ArrayList;
import java.util.List;

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
    private static final String FILE_PATH = "data/payments.bin";
    @javafx.fxml.FXML
    public void initialize() {
        paymentIdColumn.setCellValueFactory(new PropertyValueFactory<>("paymentId"));
        customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("paymentDate"));
        statusColumn.setCellValueFactory(cell -> new ReadOnlyStringWrapper(
                cell.getValue().isRefunded() ? "Refunded" : "Completed"));
        paymentTable.setItems(payments);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/BillingManagerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void loadFromFile(ActionEvent actionEvent) {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            messageLabel.setText("No payments to load.");
            return;
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            List<Payment> loaded = (List<Payment>) in.readObject();
            payments.setAll(loaded);
            paymentTable.setItems(payments);
            messageLabel.setText("Payments loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            messageLabel.setText("Failed to load payments.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void saveToFile(ActionEvent actionEvent) {
        File dir = new File("data");
        if (!dir.exists()) dir.mkdirs();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            out.writeObject(new ArrayList<>(payments));
            messageLabel.setText("Payments saved successfully.");
        } catch (IOException e) {
            messageLabel.setText("Failed to save payments.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void filterPayments(ActionEvent actionEvent) {
        String query = searchField.getText().trim();
        if (query.isEmpty()) {
            paymentTable.setItems(payments);
            messageLabel.setText("No filter applied.");
            return;
        }
        ObservableList<Payment> filtered = FXCollections.observableArrayList();
        for(Payment p : payments){
            if(p.getPaymentId().toLowerCase().contains(query)|| p.getCustomerId().toLowerCase().contains(query)||(p.isRefunded() ? "refund":"completed").contains(query.toLowerCase())){
                filtered.add(p);
            }
        }
        paymentTable.setItems(filtered);
        messageLabel.setText(filtered.isEmpty() ? "No results found." : "Found " + filtered.size() + " results.");
        }
}