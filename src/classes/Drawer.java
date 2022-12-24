package classes;

import enums.Colors;
import interfaces.Draw;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Drawer implements Draw {
    @Override
    public void createImage(Pixel[][] pixels, String fileName) throws IOException {
        BufferedImage image = new BufferedImage(pixels[0].length, pixels.length, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[1].length; x++) {
                image.setRGB(x, y, pixels[y][x].getColor().getRGB());
            }
        }
        ImageIO.write(image, "png", new File(String.format("%s.png", fileName)));
    }

    @Override
    public void randomFill(Pixel[][] pixels) {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[y].length; x++) {
                pixels[y][x] = new Pixel(y, x);
                pixels[y][x].setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            }
        }
    }

    public void randomFillBW(Pixel[][] pixels) {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[y].length; x++) {
                pixels[y][x] = new Pixel(y, x);
                int dimness = (int) (Math.random() * 255);
                pixels[y][x].setColor(new Color(dimness, dimness, dimness));
            }
        }
    }

    public void randomFillBasicColors(Pixel[][] pixels) {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[y].length; x++) {
                pixels[y][x] = new Pixel(y, x);
                pixels[y][x].setColor(Colors.getRandomColor());
            }
        }
    }

    public void monoFill(Pixel[][] pixels, Color color) {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[y].length; x++) {
                pixels[y][x] = new Pixel(y, x);
                pixels[y][x].setColor(color);
            }
        }
    }

    public void smoothing(Pixel[][] pixels) {
        Pixel[][] sPixels = new Pixel[pixels.length][pixels[0].length];
        for (int y = 0; y < pixels.length; y++) {
            System.arraycopy(pixels[y], 0, sPixels[y], 0, pixels[y].length);
        }
        for (Pixel[] pixel : pixels) {
            for (Pixel value : pixel) {
                value.smoothing(sPixels);
            }
        }
    }

    public Pixel[][] getImage(File file) throws IOException {
            BufferedImage image = ImageIO.read(file);
            Pixel[][] pixels = new Pixel[image.getHeight()][image.getWidth()];
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++){
                    pixels[y][x] = new Pixel(y,x);
                    pixels[y][x].setColor(new Color(image.getRGB(x, y)));
                }
            }
            return pixels;
    }
}
