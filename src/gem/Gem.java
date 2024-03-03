package gem;

import javafx.scene.image.Image;
import utils.initImage;

import java.io.InputStream;

public class Gem implements initImage {
    private int quantity;
    private Image image;

    public Gem() {
        setQuantity(0);
    }

    public Gem(int quantity){
        setQuantity(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(0,quantity);
    }

    @Override
    public void setImageByPath(String imagePath) {
        try {
            // Load the image using the provided imagePath
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(imagePath);
            if (inputStream != null) {
                this.image = new Image(inputStream);
            } else {
                System.out.println("Input stream is null for imagePath: " + imagePath);
            }
        } catch (Exception e) {
            System.out.println("Error loading image from imagePath: " + imagePath);
            e.printStackTrace();
        }
    }

    @Override
    public Image getImage() {
        return image;
    }
}
