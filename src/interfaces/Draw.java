package interfaces;

import enums.Colors;

import java.io.IOException;
import java.util.Map;

public interface Draw {
    void randomFill(Colors[][] array);
    void gradientFill(byte[][] array, int resolution);
    void toTxtFile(byte[][] array, String fileName, Map<Byte, Character> characters) throws IOException;
    void toImgFile(Colors[][] array, String fileName) throws IOException;
}
