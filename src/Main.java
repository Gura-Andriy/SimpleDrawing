import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
        byte[][] array = new byte[12][30];
        new FieldMaker().drawSquare(array);
        new FieldMaker().toFile(array, file);
    }
}
