package screen;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import utils.Property;

import java.awt.*;

public class StartScreen {
    private static StackPane root;
    private Canvas canvas;
    private GraphicsContext gc;
    public ButtonStart menu;
    private Stage stage;
    private AnimationTimer startScreenSong;


    public StartScreen(Stage stage) {
        this.stage = stage;
        canvas = new Canvas(Property.WIDTH,Property.HEIGHT);
        gc = canvas.getGraphicsContext2D();
        menu = new ButtonStart();
        setUp();
    }
    public void draw(GraphicsContext gc) {
        root = new StackPane();
        root.setPrefSize(Property.WIDTH,Property.HEIGHT);
        root.getChildren().addAll(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Splendor");
        stage.setResizable(false);
        root.getChildren().addAll(menu);
    }
    public void setBackground() {
        Image image = new Image(ClassLoader.getSystemResource("picture/bgStart.jpg").toString());
        gc.drawImage(image,0, 0, Property.WIDTH,Property.HEIGHT);
        gc.setFill(Color.BLACK);
        draw(gc);
    }
    public void setUp() {
        menu.player2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Property.NUMBER_OF_PLAYER = 2;
                GameScreen gameScreen = new GameScreen(stage,2);
            }
        });
        menu.player3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Property.NUMBER_OF_PLAYER = 3;
                GameScreen gameScreen = new GameScreen(stage,3);
            }
        });
        menu.player4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Property.NUMBER_OF_PLAYER = 4;
                GameScreen gameScreen = new GameScreen(stage,4);

            }
        });
        setBackground();
    }

    public static StackPane getRoot() {
        return root;
    }


}
