package com.leonardo.trafficsim.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX is working!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);
        stage.setTitle("Test");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
