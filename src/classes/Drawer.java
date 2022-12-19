package classes;

import enums.Colors;
import interfaces.Draw;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Drawer implements Draw {
    public void createImage(Colors[][] array, String fileName) throws IOException {
        BufferedImage image = new BufferedImage(array[0].length, array.length, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                Colors pixel = array[i][j];
                Color color = new Color(pixel.getR(), pixel.getG(), pixel.getB());
                image.setRGB(j, i, color.getRGB());
            }
        }
        ImageIO.write(image, "png", new File(String.format("%s.png", fileName)));
    }

    public void randomFill(Colors[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Colors.getRandomColor();
            }
        }
    }
}
