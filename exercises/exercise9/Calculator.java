package com.example.exercise9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Calculator extends Application {
    private TextField num1Text, num2Text, resultText;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");
        GridPane grid = new GridPane();
        Button AddButton = new Button("+");
        AddButton.setOnAction(e -> calculate("+"));
        GridPane.setConstraints(AddButton, 0, 3);

        Button minusButton = new Button("-");
        minusButton.setOnAction(e -> calculate("-"));
        GridPane.setConstraints(minusButton, 1, 3);

        Button multiplyButton = new Button("*");
        multiplyButton.setOnAction(e -> calculate("*"));
        GridPane.setConstraints(multiplyButton, 0, 4);

        Button divideButton = new Button("/");
        divideButton.setOnAction(e -> calculate("/"));
        GridPane.setConstraints(divideButton, 1, 4);

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearInputs());
        GridPane.setConstraints(clearButton, 0, 5);

        num1Text = new TextField();
        Label num1Label = new Label("Num 1:");
        GridPane.setConstraints(num1Text, 1, 0);
        GridPane.setConstraints(num1Label, 0, 0);

        num2Text = new TextField();
        Label num2Label = new Label("Num 2:");
        GridPane.setConstraints(num2Text, 1, 1);
        GridPane.setConstraints(num2Label, 0, 1);

        resultText = new TextField();
        Label resultLabel = new Label("Result:");
        GridPane.setConstraints(resultText, 1, 2);
        GridPane.setConstraints(resultLabel, 0, 2);

        grid.setPadding(new Insets(8, 8, 8, 8));
        grid.setVgap(5);
        grid.setHgap(8);
        grid.getChildren().addAll(AddButton, minusButton, multiplyButton, divideButton, clearButton, num1Text, num2Text, resultText, num1Label, num2Label, resultLabel);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculate(String operator) {
        double num1 = Double.parseDouble(num1Text.getText());
        double num2 = Double.parseDouble(num2Text.getText());
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        resultText.setText(String.valueOf(result));
    }
    private void clearInputs() {
        num1Text.setText("");
        num2Text.setText("");
        resultText.setText("");
    }
}

