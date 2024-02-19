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
    public void start(Stage stage)  {
        Scene scene = new Scene(StartScreen.getStartScreen(),1280,720);
        stage.setScene(scene);
        stage.setTitle("Splendor");
        stage.setResizable(false);
        stage.show();
    }
}
