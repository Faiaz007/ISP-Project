package com.isp.siddique;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
public class BandwidthManager {
    @FXML
    private Slider totalBandwidthSlider;

    @FXML
    private TextField downloadField;

    @FXML
    private TextField uploadField;

    @FXML
    private Button applyChangesButton;

    @FXML
    private Button previousButton;

    @FXML
    private void initialize() {

        totalBandwidthSlider.setMin(0);
        totalBandwidthSlider.setMax(1024);
        totalBandwidthSlider.setValue(512); // Midpoint example
    }

    @FXML
    private void handleApplyChanges() {
        String download = downloadField.getText();
        String upload = uploadField.getText();
        double totalBandwidth = totalBandwidthSlider.getValue();


        if (download.isEmpty() || upload.isEmpty()) {
            System.out.println("Please enter both download and upload values.");
            return;
        }


        System.out.println("Applying changes:");
        System.out.println("Total Bandwidth: " + totalBandwidth + " Mbps");
        System.out.println("Download: " + download);
        System.out.println("Upload: " + upload);
    }

    @FXML
    private void handlePrevious() {
        System.out.println("Navigating to previous screen...");

    }
}
