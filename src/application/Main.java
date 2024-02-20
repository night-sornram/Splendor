package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import screen.StartScreen;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        StartScreen start = new StartScreen(stage);
        stage.setTitle("Splendor");
        stage.setResizable(false);
        stage.show();
    }
}
