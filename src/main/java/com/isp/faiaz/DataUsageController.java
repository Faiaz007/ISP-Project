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

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.*;


import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class DataUsageController {
    @javafx.fxml.FXML
    private DatePicker fromDate;
    @javafx.fxml.FXML
    private TableColumn<DataUsage, String> planNameColumn;
    @javafx.fxml.FXML
    private TableView<DataUsage> dataUsageTableView;
    @javafx.fxml.FXML
    private TableColumn<DataUsage, String> timeSlotColumn;
    @javafx.fxml.FXML
    private TableColumn<DataUsage, String> userIdColumn;
    @javafx.fxml.FXML
    private TableColumn<DataUsage, Double> dataUsedColumn;
    @javafx.fxml.FXML
    private DatePicker toDate;
    @javafx.fxml.FXML
    private TableColumn<DataUsage, String> dateColumn;
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
                new DataUsage("U001", "Basic", LocalDate.of(2025, 6, 20), 450, "Morning"),
                new DataUsage("U002", "Pro", LocalDate.of(2025, 5, 25), 800, "Evening"),
                new DataUsage("U003", "Premium", LocalDate.of(2025, 4, 10), 1200, "Night"),
                new DataUsage("U004", "Pro", LocalDate.of(2025, 3, 28), 950, "Morning"),
                new DataUsage("U005", "Basic", LocalDate.of(2025, 3, 15), 400, "Evening"),
                new DataUsage("U005", "Basic", LocalDate.of(2025, 2, 7), 650, "Night")
        );
        dataUsageTableView.setItems(FXCollections.observableList(allData));


    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/CustomerGoals.fxml");
    }

    @javafx.fxml.FXML
    public void handleExportPdf(ActionEvent actionEvent) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save PDF");
        fileChooser.setInitialFileName("DataUsageReport.pdf");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));

        File file = fileChooser.showSaveDialog(null);
        if (file == null) return;


        PdfWriter writer = new PdfWriter(file.getAbsolutePath());
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        document.add(new Paragraph("Data Usage Report"));
        com.itextpdf.layout.element.Table table = new com.itextpdf.layout.element.Table(5);
        table.addHeaderCell("User ID");
        table.addHeaderCell("Plan Name");
        table.addHeaderCell("Date");
        table.addHeaderCell("Data Used");
        table.addHeaderCell("Time Slot");

        for (DataUsage dataUsage : dataUsageTableView.getItems()) {
            table.addCell(dataUsage.getDataUsageId());
            table.addCell(dataUsage.getPlanName());
            table.addCell(dataUsage.getDate().toString());
            table.addCell(String.valueOf(dataUsage.getDataUsed()));
            table.addCell(dataUsage.getTimeSlot());

        }
        document.add(table);
        document.close();


        System.out.println("PDF would be saved to: " + file.getAbsolutePath());


    }


    @javafx.fxml.FXML
    public void handleFilterUsage(ActionEvent actionEvent) {
        LocalDate from = fromDate.getValue();
        LocalDate to = toDate.getValue();

        ObservableList<DataUsage> filteredList = FXCollections.observableArrayList();

        for (DataUsage dataUsage : allData) {
            LocalDate date = dataUsage.getDate();

            boolean afterFrom = (from == null) || (date.isEqual(from) || date.isAfter(from));
            boolean beforeTo = (to == null) || (date.isEqual(to) || date.isBefore(to));

            if (afterFrom && beforeTo) {
                filteredList.add(dataUsage);
            }
        }

        dataUsageTableView.setItems(filteredList);
    }
}