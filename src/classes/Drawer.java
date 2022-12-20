package classes;

import enums.Colors;
import interfaces.Draw;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class Drawer implements Draw {
    @Override
    public void createImage(Pixel[][] pixels, String fileName) throws IOException {
        BufferedImage image = new BufferedImage(pixels[0].length, pixels.length, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[1].length; j++) {
                image.setRGB(j, i, pixels[i][j].getColor().getRGB());
            }
        }
        ImageIO.write(image, "png", new File(String.format("%s.png", fileName)));
    }

    @Override
    public void randomFill(Pixel[][] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                pixels[i][j] = new Pixel();
                pixels[i][j].setColor(Colors.getRandomColor());
            }
        }
    }
}
