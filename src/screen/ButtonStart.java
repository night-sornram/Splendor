package screen;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ButtonStart extends VBox {
    public Button start;
    public Button quit;
    public Button player2;
    public Button player3;
    public Button player4;

    public ButtonStart() {
        setSpacing(10);
        setAlignment(Pos.CENTER);
        setUpButton();
        getChildren().addAll(start,quit);

    }

    public void setUpButton() {
        start = new Button("Start");
        quit = new Button("Quit");
        player2 = new Button("2Player");
        player3 = new Button("3Player");
        player4 = new Button("4Player");
        start.setFont(Font.font(36));
        quit.setFont(Font.font(36));
        player2.setFont(Font.font(36));
        player3.setFont(Font.font(36));
        player4.setFont(Font.font(36));
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
    }
    public void selectPlayer() {
        getChildren().clear();
        getChildren().addAll(player2,player3,player4);

    }
}
