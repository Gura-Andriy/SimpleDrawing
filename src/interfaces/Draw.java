package interfaces;

import enums.Colors;

import java.io.IOException;

public interface Draw {
    void randomFill(Colors[][] array);
    void createImage(Colors[][] array, String fileName) throws IOException;
}
