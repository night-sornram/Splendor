package screen;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import utils.BackGroundImage;

import java.util.Collections;

public class StartScreen extends VBox {
    private static StartScreen instance;

    private StartScreen() {
        BackGroundImage backGroundImage = new BackGroundImage("bgStart.jpg");
        setBackground(backGroundImage.setBackGroundImage());
        setSpacing(16);
        setAlignment(Pos.CENTER);
        Button start = new Button("Start");
        Button quit = new Button("Quit");
        start.setFont(Font.font(36));
        quit.setFont(Font.font(36));
        quit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Platform.exit();
            }
        });
        start.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                selectPlayer();
            }
        });
        getChildren().addAll(start, quit);

    }

    public static StartScreen getStartScreen() {
        if (instance == null)
            instance = new StartScreen();
        return instance;
    }

    public void selectPlayer() {
        getChildren().clear();
        getChildren().addAll(selectButton("2Player",2),selectButton("3Player",3),selectButton("4Player",4));

    }

    public Button selectButton(String text, int player) {
        Button button = new Button(text);
        button.setFont(Font.font(36));
        /////////Edit in Gae Logic //////////
        /*
        setGameStart = true
        setPlayer = player(int)
         */
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println(player);
            }
        });

        return button;
    }
}
