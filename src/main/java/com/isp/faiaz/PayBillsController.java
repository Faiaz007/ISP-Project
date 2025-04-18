package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDate;

public class PayBillsController
{
    @javafx.fxml.FXML
    private TableColumn<Bills, LocalDate> dueDateColumn;
    @javafx.fxml.FXML
    private TableColumn<Bills, String>  statusColumn;
    @javafx.fxml.FXML
    private TableColumn<Bills, Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<Bills, String> billIdColumn;
    @javafx.fxml.FXML
    private ComboBox<String>  paymentMethodComboBox;
    @javafx.fxml.FXML
    private TableView<Bills> billsTable;
    @javafx.fxml.FXML
    private TextField paymentDetails;
    @javafx.fxml.FXML
    private Label paymentStatus;
    private final ObservableList<Bills> billData = FXCollections.observableArrayList() ;
    @javafx.fxml.FXML
    public void initialize() {
        billIdColumn.setCellValueFactory(cellData -> cellData.getValue().billIdProperty());
        dueDateColumn.setCellValueFactory(cellData -> cellData.getValue().dueDateProperty());
        amountColumn.setCellValueFactory(cellData -> cellData.getValue().amountProperty().asObject());

        billData.addAll(
                new Bills("B001",1200 , LocalDate.of(2025,04,10),"Pending"),
                new Bills("B002", 500, LocalDate.of(2025,05,10),"Payment Done"),
                new Bills("B003", 500, LocalDate.of(2025,06,10),"Payment Due")
        );

        billsTable.setItems(billData);
        paymentMethodComboBox.getItems().addAll("Cash", "Debit Card", "Credit Card","Bkash","Rocket");
        paymentMethodComboBox.getSelectionModel().selectFirst();

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("CustomerGoals.fxml");

    }

    @javafx.fxml.FXML
    public void processPaymentButton(ActionEvent actionEvent) {
        Bills selectedBill = billsTable.getSelectionModel().getSelectedItem();
        String method = paymentMethodComboBox.getValue();
        String details = paymentDetails.getText();

        if(selectedBill==null){
            paymentStatus.setText("Please select a bill to process payment.");
            return;
        }
        if ("Payment Done".equals(selectedBill.getStatus())) {
            paymentStatus.setText("Bill already paid.");
            return;
        }

        if(method==null || method.isEmpty()){
            paymentStatus.setText("Please select a payment method.");
            return;
        }
        if(details==null || details.isEmpty()){
            paymentStatus.setText("Please enter payment details.");
        }
        boolean paymentSuccess = Math.random() > 0.1;
        if(paymentSuccess){
            selectedBill.setStatus("Payment Done");
            billsTable.refresh();
            paymentStatus.setText("Payment successful.");
            paymentDetails.clear();
        }
        else{
            paymentStatus.setText("Payment failed.");
        }
    }
}