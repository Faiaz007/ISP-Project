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
    public void initialize() throws IOException {
        billIdColumn.setCellValueFactory(new PropertyValueFactory<>("billId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadOverdueBills();
        overdueTable.setItems(overdueBills);
    }

    private void loadOverdueBills() throws IOException {
        overdueBills.clear();
        File file = new File("data/bills.bin");
        if (!file.exists()) {
            reminderLabel.setText("No bills to remind.");
            return;
        }
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))){

            while(true){
                Bills bill = (Bills)input.readObject();
                if(bill.getDueDate().isBefore(LocalDate.now())){
                    overdueBills.add(bill);
                }
            }

        } catch (EOFException e) {
        } catch (Exception e){
            e.printStackTrace();
            reminderLabel.setText("Error loading bills.");
            return;
        }
    }

    @FXML
    public void sendReminders(ActionEvent actionEvent) {
        if (overdueBills.isEmpty()) {
            reminderLabel.setText("No overdue bills to remind.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/reminders.txt"))) {
            for (Bills bill : overdueBills) {
                String msg = "Reminder sent for Bill ID: " + bill.getBillId();
                writer.write(msg);
                writer.newLine();
            }
            reminderLabel.setText("Reminders saved for " + overdueBills.size() + " bills.");
        } catch (IOException e) {
            e.printStackTrace();
            reminderLabel.setText("Failed to save reminders.");
        }
    }

    @FXML
    public void handleBackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("faiaz/BillingManagerGoals.fxml");
    }
}
