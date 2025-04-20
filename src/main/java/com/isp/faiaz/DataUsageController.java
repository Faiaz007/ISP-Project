package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class DataUsageController
{
    @javafx.fxml.FXML
    private DatePicker fromDate;
    @javafx.fxml.FXML
    private TableColumn<DataUsage,String> planNameColumn;
    @javafx.fxml.FXML
    private TableView<DataUsage> dataUsageTableView;
    @javafx.fxml.FXML
    private TableColumn<DataUsage,String> timeSlotColumn;
    @javafx.fxml.FXML
    private TableColumn <DataUsage,String> userIdColumn;
    @javafx.fxml.FXML
    private TableColumn<DataUsage,Double> dataUsedColumn;
    @javafx.fxml.FXML
    private DatePicker toDate;
    @javafx.fxml.FXML
    private TableColumn<DataUsage,String> dateColumn;
    private final ObservableList<DataUsage> allData = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
      userIdColumn.setCellValueFactory(new PropertyValueFactory<>("dataUsageId"));
      planNameColumn.setCellValueFactory(new PropertyValueFactory<>("planName"));
      timeSlotColumn.setCellValueFactory(new PropertyValueFactory<>("timeSlot"));
      dataUsedColumn.setCellValueFactory(new PropertyValueFactory<>("dataUsed"));
      dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

      fromDate.setValue(LocalDate.now().minusMonths(1));
      toDate.setValue(LocalDate.now());
      allData.addAll(
                new DataUsage("U001", "Basic", LocalDate.now().minusDays(1), 450, "Morning"),
                new DataUsage("U002", "Pro", LocalDate.now(), 800, "Evening"),
                new DataUsage("U001", "Basic", LocalDate.now(), 300, "Afternoon")
        );
      dataUsageTableView.setItems(FXCollections.observableList(allData));


    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleExportPdf(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save PDF");
        fileChooser.setInitialFileName("DataUsageReport.pdf");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));

        File file = fileChooser.showSaveDialog(null);
        if (file == null) return;


        System.out.println("PDF would be saved to: " + file.getAbsolutePath());
    }


    @javafx.fxml.FXML
    public void handleFilterUsage(ActionEvent actionEvent) {
        LocalDate from =fromDate.getValue();
        LocalDate to = toDate.getValue();

        List<DataUsage> filteredDataUsage = dataUsageTableView.getItems().stream()
                .filter(dataUsage -> dataUsage.getDate().isAfter(from) && dataUsage.getDate().isBefore(to))
                .toList();
        dataUsageTableView.setItems(FXCollections.observableList(filteredDataUsage));
    }
}