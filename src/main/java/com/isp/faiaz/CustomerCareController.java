package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CustomerCareController {
    @FXML
    private TextField tokenField;
    @FXML
    private Label statusLabel;


    @FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }


    @FXML
    public void handleTrackRequest(ActionEvent actionEvent) {
        String token = tokenField.getText().trim();

        if (token.isEmpty()) {
            statusLabel.setText("Token field is empty.");
            return;
        }

        Request request = Request.getInstance(token);
        if (request == null) {
            statusLabel.setText("Invalid token.");
        } else {
            statusLabel.setText("Request Status: " + request.getStatus());
        }
    }
}
