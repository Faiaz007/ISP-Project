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

public class GenerateBillsController
{
    @javafx.fxml.FXML
    private Label billLabel;
    @javafx.fxml.FXML
    private TableColumn<Bills, LocalDate>  dueDateColumn;
    @javafx.fxml.FXML
    private TableColumn<Bills, String> statusColumn ;
    @javafx.fxml.FXML
    private TableColumn<Bills, Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn <Bills, String> billIdColumn;
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
                new Bills("B001",1200 , LocalDate.of(2025,04,10),"Pending"),
                new Bills("B002",1500,LocalDate.of(2025,04,10),"Pending"));
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
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bills.bin"))) {
            for (Bills b : billData) {
                out.writeObject(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
            billLabel.setText("Failed to save bills.");
        }
    }
    public void loadBillsFromFile() {
        billData.clear();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("bills.bin"))) {
            while (true) {
                Bills b = (Bills) in.readObject();
                billData.add(b);
            }
        } catch (EOFException e) {
            // Done reading
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            billLabel.setText("Failed to load bills.");
        }
    }

    @javafx.fxml.FXML
    public void handlebackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BillingManagerGoals.fxml");
    }
}