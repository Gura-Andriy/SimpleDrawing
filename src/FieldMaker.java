import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FieldMaker {
    //◙◘■▩●▦▣◚◛◕▨▧◉▤◐◒▮◍◑▼▪◤▬◗◭◖◈◎◮◊◫▰◄◯□▯▷▫▽◹△◁▸▭◅▵◌▱▹▿◠◃◦◟◞◜
    Map<Byte, Character> characters  = new HashMap<Byte, Character>() {{
        put((byte) 0, ' ');
        put((byte) 1, '◦');
        put((byte) 2, '◌');
        put((byte) 3, '△');
        put((byte) 4, '▯');
        put((byte) 5, '◫');
        put((byte) 6, '◍');
        put((byte) 7, '▨');
        put((byte) 8, '▣');
        put((byte) 9, '◙');
    }};

    public void randomFill(byte[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (byte) (Math.random() * 10);
            }
        }
    }

    public void gradientFill(byte[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (byte) (( (float)j / (float) array[1].length) * 10);
            }
        }
    }

    public void drawSquare(byte[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == (array.length / 6) || i == (array.length - (array.length / 6)) - 1) {
                    if (j >= (array[i].length / 6) - 1 && j <= (array[i].length - (array[i].length / 6)) - 1) {
                        array[i][j] = 5;
                    } else {
                        array[i][j] = 1;
                    }
                } else if (i > (array.length / 6) - 1 && i < (array.length - (array.length / 6)) - 1) {
                    if (j == (array[i].length / 6) - 1 || j == (array[i].length - (array[i].length / 6)) - 1) {
                        array[i][j] = 5;
                    } else {
                        array[i][j] = 1;
                    }
                } else {
                    array[i][j] = 1;
                }
            }
        }
    }

    public void toString(byte[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.print(characters.get(array[i][j]));
            }
            System.out.println();
        }
    }

    public void toFile(byte[][] array, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file.getName());
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                printWriter.print(characters.get(array[i][j]));
            }
            printWriter.println();
        }
        printWriter.close();
    }
}