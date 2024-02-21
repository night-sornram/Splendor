package screen;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class PlayerScreen extends VBox {
    public PlayerScreen(){
        setPrefSize(280,500);
        setBackground(new Background(new BackgroundFill(Color.BLUE, new CornerRadii(0), new Insets(0))));
        setAlignment(Pos.CENTER);
        Text t = new Text("TEST");
        getChildren().add(t);
    }

}
