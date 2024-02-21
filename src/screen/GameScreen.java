package screen;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utils.Property;

public class GameScreen extends VBox {
    private Stage stage;
    private static VBox root;
    public GameScreen(Stage stage, int numberOfPlayer){
        this.stage = stage;
        root = new VBox();
        setUp();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    public void setUp(){
        HBox menu = new HBox();
        CardBoardScreen cardBoard = new CardBoardScreen();
        ControlScreen controlScreen = new ControlScreen();
        PlayerScreen playerScreen = new PlayerScreen();
        menu.getChildren().addAll(cardBoard,playerScreen);
        root.setPrefSize(Property.WIDTH,Property.HEIGHT);
        menu.setPrefSize(1280,500);
        root.getChildren().addAll(menu,controlScreen);
    }

}
