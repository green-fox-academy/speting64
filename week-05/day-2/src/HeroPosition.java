import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class HeroPosition {

    BufferedImage image;
    int textBoxX, textBoxY;

    public HeroPosition(String filename, int textBoxX, int textBoxY) {
        this.textBoxX = textBoxX;
        this.textBoxY = textBoxY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, textBoxX, textBoxY, null);
        }
    }
}


