package screen;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Text;
import utils.Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CardBoardScreen extends GridPane {
    private GraphicsContext gc;
    public CardBoardScreen(){
        setPrefSize(1000,500);
        setAlignment(Pos.CENTER);
        Text t = new Text("TEST");
//        getChildren().add(t);
//        gc.drawImage(image,0, 0, Property.WIDTH,Property.HEIGHT);
        try {
            Image image = new Image(new FileInputStream("res/picture/gem/blueGem.jpg"));
            setBackground(new Background(new BackgroundImage(image, null, null, null, null)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
