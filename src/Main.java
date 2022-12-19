import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
        byte[][] array = new byte[12][30];
        Map<Byte, Character> pixels = new HashMap<>() {{
            put((byte) 0, '_');
            put((byte) 1, 'O');
        }};

        new ShapeDrawer2D().drawSquare(array, 6);
        new ShapeDrawer2D().toFile(array, file, pixels);
    }
}
