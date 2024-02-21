package screen;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class CardBoardScreen extends GridPane {
    public CardBoardScreen(){
        setPrefSize(1000,500);
        setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(0), new Insets(0))));
        setAlignment(Pos.CENTER);
        Text t = new Text("TEST");
        getChildren().add(t);    }
}
