package com.isp.siddique;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class CustomerComplaintTroubleshooter {

    @FXML
    private ListView<String> complaintListView;

    @FXML
    private TextArea complaintDetails;

    @FXML
    private Button resolveButton;

    @FXML
    private Button previousButton;

    @FXML
    public void initialize() {
        // Sample data for testing
        ObservableList<String> complaints = FXCollections.observableArrayList(
                "Slow internet", "Connection drops", "Billing issue", "Login problem"
        );
        complaintListView.setItems(complaints);


        complaintListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                complaintDetails.setText("Details for: " + newVal + "\n\n[Example complaint details here.]");
            }
        });


        resolveButton.setOnAction(event -> {
            String selected = complaintListView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                complaintDetails.setText("Marked \"" + selected + "\" as resolved.");
            }
        });

        previousButton.setOnAction(event -> {
            complaintDetails.clear();
            complaintListView.getSelectionModel().clearSelection();
        });
    }
}
