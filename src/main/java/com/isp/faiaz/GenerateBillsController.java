package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class GenerateBillsController {

    @javafx.fxml.FXML
    private Label billLabel;
    @javafx.fxml.FXML
    private TableColumn<Bills, LocalDate> dueDateColumn;
    @javafx.fxml.FXML
    private TableColumn<Bills, String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<Bills, Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<Bills, String> billIdColumn;
    @javafx.fxml.FXML
    private TableView<Bills> billsTable;

    private final ObservableList<Bills> billData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        billIdColumn.setCellValueFactory(new PropertyValueFactory<>("billId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadBillsFromFile();
        billsTable.setItems(billData);
        updateTotalRevenue();
    }


    @javafx.fxml.FXML
    public void generateBills(ActionEvent actionEvent) {
        billData.addAll(
                new Bills("B001", 1200, LocalDate.of(2025, 04, 10), "Pending"),
                new Bills("B002", 1500, LocalDate.of(2025, 04, 10), "Pending"),
                new Bills("B003",2000, LocalDate.of(2025, 05, 12), "Done")
        );
        billsTable.refresh();
        saveBillsToFile();
        updateTotalRevenue();
        billLabel.setText("Bills generated successfully.");
    }


    private void updateTotalRevenue() {
        double total = billData.stream()
                .mapToDouble(Bills::getAmount)
                .sum();
        billLabel.setText("Total Revenue: $" + total);
    }


    public void saveBillsToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/bills.bin"))) {
            for (Bills b : billData) {
                out.writeObject(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
            billLabel.setText("Failed to save bills.");
        }
    }

    public void loadBillsFromFile() {
        File file = new File("data/bills.bin");
        if (file.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
                while (true) {
                    try {
                        Bills b = (Bills) in.readObject();
                        billData.add(b);
                    } catch (EOFException e) {
                        break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                billLabel.setText("Failed to load bills.");
            }
        } else {
            System.out.println("No bills file found. Starting with an empty list.");
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/BillingManagerGoals.fxml");
    }
}
