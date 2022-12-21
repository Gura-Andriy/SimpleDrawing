import classes.Drawer;
import classes.Drawer2DShape;
import classes.Pixel;
import enums.Colors;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pixel[][] pixelsArray = new Pixel[120][120];
        Drawer drawer = new Drawer();
        Color color = new Color(206, 163, 163);
        Color color2 = new Color(0, 0, 0);

        drawer.randomFillBW(pixelsArray);
        drawer.smoothing(pixelsArray);
        new Drawer2DShape().createImage(pixelsArray, "random");

//        new Drawer2DShape().drawSquare(pixelsArray, 6, Colors.BLACK);
//        new Drawer2DShape().createImage(pixelsArray, "square");
//
//        drawer.monoFill(pixelsArray, color);
//        new Drawer2DShape().createImage(pixelsArray, "monochrome");
    }
}
