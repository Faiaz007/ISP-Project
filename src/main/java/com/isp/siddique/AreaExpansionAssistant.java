package com.isp.siddique;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AreaExpansionAssistant {

    @FXML
    private TextField areaNameField;

    @FXML
    private TextField locationField;

    @FXML
    private ComboBox<String> expansionTypeBox;

    @FXML
    private DatePicker completionDatePicker;

    @FXML
    private Button submitButton;

    @FXML
    private void initialize() {
        // Example items for combo box
        expansionTypeBox.getItems().addAll("Urban", "Rural", "Suburban");
    }

    @FXML
    private void handleSubmit() {
        String areaName = areaNameField.getText();
        String location = locationField.getText();
        String expansionType = expansionTypeBox.getValue();
        String completionDate = (completionDatePicker.getValue() != null)
                ? completionDatePicker.getValue().toString()
                : "Not selected";

        System.out.println("Submitted:");
        System.out.println("Area Name: " + areaName);
        System.out.println("Location: " + location);
        System.out.println("Expansion Type: " + expansionType);
        System.out.println("Completion Date: " + completionDate);


    }
}
