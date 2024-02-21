package screen;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import utils.Property;

public class GameScreen extends VBox {
    private Stage stage;
    private static StackPane root;
    public GameScreen(Stage stage, int numberOfPlayer){
        this.stage = stage;
        VBox root = new VBox();
        Pane p1 = new Pane();
        p1.setPrefSize(1000,500);
        Pane p2 = new Pane();
        p2.setPrefSize(280,500);
        p1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
        p2.setBackground(new Background(new BackgroundFill(Color.BLUE, new CornerRadii(0), new Insets(0))));
        HBox menu = new HBox();
        menu.getChildren().addAll(p1,p2);
        Pane Control = new Pane();
        Control.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(0), new Insets(0))));
        root.setPrefSize(Property.WIDTH,Property.HEIGHT);
        menu.setPrefSize(1280,500);
        Control.setPrefSize(1280,220);

        root.getChildren().addAll(menu,Control);
        Scene scene = new Scene(root);
        stage.setScene(scene);



    }

}
