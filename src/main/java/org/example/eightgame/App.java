package org.example.eightgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    /**
     * The main method
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * A method to start the application
     * @param primaryStage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws IOException Thrown if something goes wrong with the input or output.
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EightGameUI.fxml"));
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.setTitle("8-GAME");
        primaryStage.show();
    }
}
