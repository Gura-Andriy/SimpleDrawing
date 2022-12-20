package interfaces;

import enums.Cardinals;

import java.awt.*;
import java.util.Map;

public interface PixelInterface {
    Map<String, Cardinals> getNeighbors();
    void setCoordinates(int y, int x);
    void setColor(Color color);
    int getY();
    int getX();
    Color getColor();
}
