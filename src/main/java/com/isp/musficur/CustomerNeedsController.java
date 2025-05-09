package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CustomerNeedsController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField preferancesTextField;
    @javafx.fxml.FXML
    private TextField timePeriodTextField;
    @javafx.fxml.FXML
    private Label preferancesOutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void previousButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/marketingManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("faiaz/login-view.fxml");
    }

    @javafx.fxml.FXML
    public void getDataButtonOnAction(ActionEvent actionEvent) {
        if (idTextField.getText().trim().isEmpty()){
            preferancesOutputLabel.setText(("Enter a  ID to Continue"));
            return;
        }
        if (emailTextField.getText().trim().isEmpty()) {
            preferancesOutputLabel.setText(("Enter a email to Continue"));
            return;
        }
        if (preferancesTextField.getText().trim().isEmpty()) {
            preferancesOutputLabel.setText(("Enter any preferences to Continue"));
            return;
        }
        if (timePeriodTextField.getText().trim().isEmpty()) {
            preferancesOutputLabel.setText(("Enter a time limit to Continue"));
            return;
        }


        preferancesOutputLabel.setText("Success");
    }


    @javafx.fxml.FXML
    public void generateButtonOnAction(ActionEvent actionEvent) {
        if (idTextField.getText().trim().isEmpty()){
            preferancesOutputLabel.setText(("Enter a  ID to Continue"));
            return;
        }
        if (emailTextField.getText().trim().isEmpty()) {
            preferancesOutputLabel.setText(("Enter a email to Continue"));
            return;
        }
        if (preferancesTextField.getText().trim().isEmpty()) {
            preferancesOutputLabel.setText(("Enter any preferences to Continue"));
            return;
        }
        if (timePeriodTextField.getText().trim().isEmpty()) {
            preferancesOutputLabel.setText(("Enter a time limit to Continue"));
            return;
        }


        preferancesOutputLabel.setText("Successfully generated");
    }
}