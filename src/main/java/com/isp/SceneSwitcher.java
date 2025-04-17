package com.isp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {
    public static Stage stage;
    public static void setStage(Stage s) {
        stage = s ;
    }
    public static void switchTo(String fxmlFile) throws IOException {
        Parent root = FXMLLoader.load(SceneSwitcher.class.getResource("/com/isp/faiaz/" + fxmlFile));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void switchToDashboard() throws IOException {
        switchTo("Dashboard.fxml");
    }


}
