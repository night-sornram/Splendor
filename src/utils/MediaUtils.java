package  utils;

import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;

import java.io.InputStream;

public class MediaUtils {
    private Image image;
    private AudioClip sound;

    public Image getImage() {
        return image;
    }

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

    public AudioClip getSound(String soundPath) {
        try {
            // Load the sound using the provided soundPath
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(soundPath);
            if (inputStream != null) {
                this.sound = new AudioClip(inputStream.toString());
                return this.sound;
            } else {
                System.out.println("Input stream is null for soundPath: " + soundPath);
            }
        } catch (Exception e) {
            System.out.println("Error loading sound from soundPath: " + soundPath);
            e.printStackTrace();
        }
        return null;
    }
}
