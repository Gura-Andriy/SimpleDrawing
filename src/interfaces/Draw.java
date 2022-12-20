package interfaces;

import classes.Pixel;

import java.io.IOException;

public interface Draw {
    void createImage(Pixel[][] pixels, String fileName) throws IOException;
    void randomFill(Pixel[][] pixels);
}
