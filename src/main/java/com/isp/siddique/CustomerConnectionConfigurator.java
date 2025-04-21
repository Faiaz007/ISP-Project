package com.isp.siddique;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CustomerConnectionConfigurator {

    @FXML
    private TextField ipField;

    @FXML
    private TextField macField;

    @FXML
    private TextField planField;

    @FXML
    private Button submitButton;

    @FXML
    private Button previousButton;

    @FXML
    private Button logoutButton;

    @FXML
    public void initialize() {
        // Submit button logic
        submitButton.setOnAction(event -> {
            String ip = ipField.getText();
            String mac = macField.getText();
            String plan = planField.getText();

            if (!ip.isEmpty() && !mac.isEmpty() && !plan.isEmpty()) {
                System.out.println("Submitted Configuration:");
                System.out.println("IP: " + ip);
                System.out.println("MAC: " + mac);
                System.out.println("Plan: " + plan);

            } else {
                System.out.println("All fields are required.");
            }
        });

        previousButton.setOnAction(event -> {
            System.out.println("Navigating to previous screen...");

        });

        logoutButton.setOnAction(event -> {
            System.out.println("Logging out...");

        });
    }
}
