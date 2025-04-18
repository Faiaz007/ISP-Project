package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class GenerateReportController
{
    @javafx.fxml.FXML
    private Label reportStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        try {
            SceneSwitcher.switchTo("BillingManagerGoals.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void generateAndExportPdf(ActionEvent actionEvent) {

    }


}