import classes.Drawer;
import classes.Drawer2DShape;
import classes.Pixel;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Pixel[][] pixelsArray = new Pixel[120][120];
        Drawer drawer = new Drawer();

        drawer.randomFill(pixelsArray);
        new Drawer2DShape().createImage(pixelsArray, "random");

        Pixel[][] pixelsArrayLego = drawer.getImage(new File("LEGO_logo.png"));
        drawer.smoothing(pixelsArrayLego);
        new Drawer2DShape().createImage(pixelsArrayLego, "lego");
    }
}
