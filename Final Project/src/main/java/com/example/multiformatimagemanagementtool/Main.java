package com.example.multiformatimagemanagementtool;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

// The main class that starts the application
public class Main extends Application {

    // This method sets up the primary stage and loads the FXML file
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Multi-Format Image Management Tool");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    // The main method that launches the application
    public static void main(String[] args) {
        launch(args);
    }
}