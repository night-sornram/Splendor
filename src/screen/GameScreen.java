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

        //Create left-hand titled pane for the films list and centre it in VBox
        Text films = new Text();
        films.setText("Films");
        Pane test1 = new Pane();
        test1.setPrefWidth(1200);
        test1.setPrefHeight(500);
        test1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
        VBox filmsBox = new VBox(test1);

        //Create right-hand titled pane for the books list and centre it in Vbox
        Text books = new Text();
        books.setText("Books");
        VBox booksBox = new VBox(books);

        //Create mainSplit pane
        Text arts = new Text();
        arts.setText("arts");
        VBox artsBox = new VBox(arts);

        SplitPane mainSplit = new SplitPane();
        mainSplit.getItems().addAll(filmsBox,  booksBox);
        mainSplit.setDividerPosition(0,10/(double)12);

        SplitPane root = new SplitPane();
        root.setOrientation(Orientation.VERTICAL);
        root.getItems().addAll(mainSplit, artsBox);
        root.setDividerPosition(0,0.7);

        root.setPrefWidth(1280);

        root.setPrefHeight(720);
        SplitPane.setResizableWithParent(root, false);
        //Start up scene and stage
        Scene scene = new Scene(root);
        stage.setScene(scene);

    }

}
