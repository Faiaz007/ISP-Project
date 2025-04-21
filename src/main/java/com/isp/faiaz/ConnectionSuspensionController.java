package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

public class ConnectionSuspensionController
{
    @javafx.fxml.FXML
    private TextArea messageArea;
    @javafx.fxml.FXML
    private TextField customerIdField;
    private List<Customer> customerList= CustomerData.getCustomerList();
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSuspendConnection(ActionEvent actionEvent) {
        String customerId = customerIdField.getText().trim();
        if (customerId.isEmpty()) {
            messageArea.setText("Customer ID field is empty.");
            return;
        }

        Customer customer = findCustomerById(customerId);
        if (customer == null) {
            messageArea.setText("No customer found with ID: " + customerId);
            return;
        } else if (customer.isSuspended()) {
            messageArea.setText("Connection already suspended.");
            return;
        } else if (customer.getBillAmount() > 0) {
            messageArea.setText(" Cannot suspend. Outstanding bill: $" + customer.getBillAmount());
            return;
        } else if (customer.hasIssue()) {
            messageArea.setText("Cannot suspend. Issue is reported by the customer.");
            return;
        }

        customer.setSuspended(true);
        messageArea.setText("Connection suspended successfully for customer ID: " + customerId);
    }
    private Customer findCustomerById(String id) {
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }
}