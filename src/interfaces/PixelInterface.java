package interfaces;

import classes.Pixel;

import java.awt.*;
import java.util.ArrayList;

public interface PixelInterface {
    ArrayList<Pixel> getNeighbors(Pixel[][] pixels);
    void setCoordinates(int y, int x);
    void setColor(Color color);
    int getY();
    int getX();
    Color getColor();
}
