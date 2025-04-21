package com.isp.musficur;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.imageio.IIOException;
import java.io.IOException;

public class MarketingPlanController
{
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TextField audienceTextField;
    @javafx.fxml.FXML
    private Label marketingPlanOutputLabel;
    @javafx.fxml.FXML
    private TextField timelineTextField;
    @javafx.fxml.FXML
    private TextField objectiveTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void launchButtonOnAction(ActionEvent actionEvent) {
        if (budgetTextField.getText().trim().isEmpty()){
            marketingPlanOutputLabel.setText(("Enter a Budget to Continue"));
            return;
        }
        if (audienceTextField.getText().trim().isEmpty()) {
            marketingPlanOutputLabel.setText(("Enter targeted audience info to Continue"));
            return;
        }
        if (timelineTextField.getText().trim().isEmpty()) {
            marketingPlanOutputLabel.setText(("Enter any timeline to Continue"));
            return;
        }
        if (objectiveTextField.getText().trim().isEmpty()) {
            marketingPlanOutputLabel.setText(("Enter a objective to Continue"));
            return;
        }


        marketingPlanOutputLabel.setText("Success");
    }

    @javafx.fxml.FXML
    public void previousButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("musficur/marketingManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/login-view.fxml");
    }
}