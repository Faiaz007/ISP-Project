package com.isp.faiaz;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RefundsDiscountsController
{
    @javafx.fxml.FXML
    private TextField discountPercentageField;
    @javafx.fxml.FXML
    private TextField refundAmountField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApplyRefund(ActionEvent actionEvent) {
        String refundAmountText = refundAmountField.getText().trim();

        // Validate refund amount
        if (refundAmountText.isEmpty()) {
            statusLabel.setText("Please enter a refund amount.");
            return;
        }

        try {
            double refundAmount = Double.parseDouble(refundAmountText);

            if (refundAmount <= 0) {
                statusLabel.setText("Refund amount must be greater than 0.");
            } else {
                statusLabel.setText("Refund of $" + refundAmount + " applied successfully.");
            }
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid refund amount.");
        }
    }

    @javafx.fxml.FXML
    public void handleApplyDiscount(ActionEvent actionEvent) {
        String discountText = discountPercentageField.getText().trim();

        if (discountText.isEmpty()) {
            statusLabel.setText("Please enter a discount percentage.");
            return;
        }

        try {
            double discountPercentage = Double.parseDouble(discountText);

            if (discountPercentage <= 0 || discountPercentage > 100) {
                statusLabel.setText("Discount must be between 0 and 100.");
            } else {
                statusLabel.setText("Discount of " + discountPercentage + "% applied successfully.");
            }
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid discount percentage.");
        }
    }
}