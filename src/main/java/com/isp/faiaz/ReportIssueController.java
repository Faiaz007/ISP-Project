package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReportIssueController
{
    @javafx.fxml.FXML
    private ComboBox<String> issueTypeComboBox;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextArea issuesTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        issueTypeComboBox.getItems().addAll("Billing Problem",
                "Connectivity Issue",
                "Slow Speed",
                "Technical Support",
                "Other");
    }

    @javafx.fxml.FXML
    public void handleSubmitIssue(ActionEvent actionEvent) {
        String type = issueTypeComboBox.getValue();
        String description = descriptionTextArea.getText();
        if (type == null || description.isEmpty()) {
            confirmationLabel.setText("Please fill in all fields.");
        }
        try (FileWriter writer = new FileWriter("data.txt", true)) {
            writer.write("Issue Type: " + type + "\n");
            writer.write("Description: " + description + "\n");
            writer.write("--------------------------------------------------\n");
            confirmationLabel.setText("Issue saved to data.txt");
        } catch (IOException e) {
            confirmationLabel.setText("Error saving issue.");
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleLoadIssues(ActionEvent actionEvent)  {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            StringBuilder content = new StringBuilder();
            String line;


            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            issuesTextArea.setText(content.toString());
            confirmationLabel.setText("Issues loaded.");
        } catch (IOException e) {
            confirmationLabel.setText("Could not load from file!");
            e.printStackTrace();
        }
    }
}