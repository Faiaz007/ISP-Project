package com.isp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {
    public static Stage stage;

    public static void switchScene(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(SceneSwitcher.class.getResource("login-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

}
