import classes.Drawer;
import classes.Drawer2DShape;
import enums.Colors;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Colors[][] imageArray = new Colors[120][120];

        new Drawer().randomFill(imageArray);
        new Drawer2DShape().createImage(imageArray, "random");

        new Drawer2DShape().drawSquare(imageArray, 6, Colors.BLACK);
        new Drawer2DShape().createImage(imageArray, "square");
    }
}
