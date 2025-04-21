package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LoginView {
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label massageLabel;
    private final List<Person> users = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logInButtonOnClick(ActionEvent actionEvent) throws IOException {
        String inputUsername = userNameTextField.getText().trim();
        String inputPassword = passwordTextField.getText().trim();

        for (User user : UserManager.getUserList()) {
            if (user.getUserName().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                massageLabel.setText("Login successful! Welcome, " + user.getUserName());
                SceneSwitcher.switchToDashboard();
                return;
            }

        }
        massageLabel.setText("Invalid username or password.");
    }
}