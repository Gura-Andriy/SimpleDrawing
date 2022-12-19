import classes.Drawer;
import classes.Drawer2DShape;
import enums.Colors;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[][] textArray = new byte[12][30];
        Colors[][] imageArray = new Colors[120][120];
        new Drawer().randomFill(imageArray);
        Map<Byte, Character> characters = new HashMap<>() {{
            put((byte) 0, '_');
            put((byte) 1, 'O');
        }};

        new Drawer2DShape().drawSquare(imageArray, 55);
        new Drawer2DShape().toTxtFile(textArray, "output", characters);
        new Drawer2DShape().toImgFile(imageArray, "output");
    }
}
