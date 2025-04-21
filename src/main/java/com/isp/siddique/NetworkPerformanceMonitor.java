package com.isp.siddique;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
public class NetworkPerformanceMonitor {
    @FXML
    private CheckBox enableMonitoringCheckBox;

    @FXML
    private TextField latencyField;

    @FXML
    private TextField packetLossField;

    @FXML
    private TextField throughputField;

    @FXML
    private Button startMonitoringButton;

    @FXML
    private void initialize() {

        setInputsDisabled(true);


        enableMonitoringCheckBox.setOnAction(e -> {
            boolean enabled = enableMonitoringCheckBox.isSelected();
            setInputsDisabled(!enabled);
        });
    }

    @FXML
    private void startMonitoring() {

        latencyField.setText("15 ms");
        packetLossField.setText("0.3 %");
        throughputField.setText("92 Mbps");
    }

    private void setInputsDisabled(boolean disable) {
        latencyField.setDisable(disable);
        packetLossField.setDisable(disable);
        throughputField.setDisable(disable);
        startMonitoringButton.setDisable(disable);
    }
}
