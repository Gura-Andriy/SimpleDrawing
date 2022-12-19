import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Drawer {
    public void randomFill(byte[][] array, int resolution) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (byte) (Math.random() * resolution);
            }
        }
    }

    public void gradientFill(byte[][] array, int resolution) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (byte) (( (float)j / (float) array[1].length) * resolution);
            }
        }
    }

    public void print(byte[][] array, Map<Byte, Character> pixels) {
        for (byte[] bytes : array) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.print(pixels.get(bytes[j]));
            }
            System.out.println();
        }
    }

    public void toFile(byte[][] array, File file, Map<Byte, Character> pixels) throws IOException {
        FileWriter fileWriter = new FileWriter(file.getName());
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (byte[] bytes : array) {
            for (int j = 0; j < array[1].length; j++) {
                printWriter.print(pixels.get(bytes[j]));
            }
            printWriter.println();
        }
        printWriter.close();
    }
}
