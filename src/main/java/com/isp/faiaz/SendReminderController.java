package com.isp.faiaz;

import com.isp.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class SendReminderController {
    @FXML private Label reminderLabel;
    @FXML private TableView<Bills> overdueTable;
    @FXML private TableColumn<Bills, String> billIdColumn;
    @FXML private TableColumn<Bills, Double> amountColumn;
    @FXML private TableColumn<Bills, LocalDate> dueDateColumn;
    @FXML private TableColumn<Bills, String> statusColumn;

    private final ObservableList<Bills> overdueBills = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        billIdColumn.setCellValueFactory(new PropertyValueFactory<>("billId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadOverdueBills();
        overdueTable.setItems(overdueBills);
    }

    private void loadOverdueBills() {
        overdueBills.clear();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("bills.bin"))) {
            while (true){
                Bills bill = (Bills) in.readObject();
                if (!"Payment Done".equalsIgnoreCase(bill.getStatus()) &&
                        bill.getDueDate().isBefore(LocalDate.now())) {
                    overdueBills.add(bill);
                }
            }
        } catch (EOFException e) {
            reminderLabel.setText("Found " + overdueBills.size() + " overdue bills.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            reminderLabel.setText("Failed to load bills.");
        }
    }

    @FXML
    public void sendReminders(ActionEvent actionEvent) {
        if (overdueBills.isEmpty()) {
            reminderLabel.setText("No overdue bills to remind.");
            return;
        }

        try (FileWriter writer = new FileWriter("reminders.txt")) {
            for (Bills bill : overdueBills) {
                String msg = "Reminder sent for Bill ID: " + bill.getBillId();
                System.out.println(msg);
                writer.write(msg + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            reminderLabel.setText("Failed to export reminders.");
            return;
        }

        reminderLabel.setText("Reminders sent for " + overdueBills.size() + " bills. Saved to reminders.txt.");
    }

    @FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BillingManagerGoals.fxml");
    }
}
