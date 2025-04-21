package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TrackRequestController
{
    @javafx.fxml.FXML
    private TextField tokenField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleTrackRequest(ActionEvent actionEvent) {
        String token = tokenField.getText().trim();

        if (token.isEmpty()) {
            statusLabel.setText("Please enter a valid token.");
            return;
        }


        Request request = findRequestByToken(token);

        if (request == null) {
            statusLabel.setText("No request found for token: " + token);
        } else {
            statusLabel.setText("Request Status: " + request.getStatus());
        }
    }
    private Request findRequestByToken(String token) {

        if (token.equals("12345")) {
            return new Request(token, "In Progress");
        } else if (token.equals("67890")) {
            return new Request(token, "Resolved");
        } else {
            return null;
        }
    }

}