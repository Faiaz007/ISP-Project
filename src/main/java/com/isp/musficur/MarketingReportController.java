package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MarketingReportController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField dataTextField;
    @javafx.fxml.FXML
    private TextField reportTypeTextField;
    @javafx.fxml.FXML
    private Label marketingReportOutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void previousButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/marketingManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/login-view.fxml");
    }

    @javafx.fxml.FXML
    public void getDataButtonOnAction(ActionEvent actionEvent) {
        if (idTextField.getText().trim().isEmpty()){
            marketingReportOutputLabel.setText(("Enter a  ID to Continue"));
            return;
        }
        if (dataTextField.getText().trim().isEmpty()) {
            marketingReportOutputLabel.setText(("Enter a data to Continue"));
            return;
        }
        if (reportTypeTextField.getText().trim().isEmpty()) {
            marketingReportOutputLabel.setText(("Enter Report type to Continue"));
            return;
        }

        marketingReportOutputLabel.setText("Success");
    }

    @javafx.fxml.FXML
    public void generateButtonOnAction(ActionEvent actionEvent) {
        if (idTextField.getText().trim().isEmpty()){
            marketingReportOutputLabel.setText(("Enter a  ID to Continue"));
            return;
        }
        if (dataTextField.getText().trim().isEmpty()) {
            marketingReportOutputLabel.setText(("Enter a data to Continue"));
            return;
        }
        if (reportTypeTextField.getText().trim().isEmpty()) {
            marketingReportOutputLabel.setText(("Enter Report type to Continue"));
            return;
        }

        marketingReportOutputLabel.setText("Success");
    }
}