package screen;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utils.Property;

public class GameScreen extends VBox {
    private Stage stage;
    private static StackPane root;
    private Canvas canvas;
    private GraphicsContext gc;
    public GameScreen(Stage stage, int numberOfPlayer){
        this.stage = stage;
        VBox root = new VBox();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        canvas = new Canvas(Property.WIDTH,Property.HEIGHT);
        gc = canvas.getGraphicsContext2D();
        System.out.println(Property.NUMBER_OF_PLAYER);
        setUp();

    }
    public void draw(GraphicsContext gc) {
        root = new StackPane();
        root.setPrefSize(Property.WIDTH,Property.HEIGHT);
        root.getChildren().addAll(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    public void setUp() {
        Image image = new Image(ClassLoader.getSystemResource("picture/test.jpg").toString());
        gc.drawImage(image,0, 0,Property.WIDTH,Property.HEIGHT);
        gc.setFill(Color.BLACK);
        draw(gc);
    }


}
