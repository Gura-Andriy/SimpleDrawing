import classes.Drawer;
import classes.Drawer2DShape;
import classes.Pixel;
import enums.Colors;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pixel[][] pixelsArray = new Pixel[120][120];

        new Drawer().randomFill(pixelsArray);
        new Drawer2DShape().createImage(pixelsArray, "random");

        new Drawer2DShape().drawSquare(pixelsArray, 6, Colors.BLACK);
        new Drawer2DShape().createImage(pixelsArray, "square");
    }
}
