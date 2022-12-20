package classes;

import enums.Cardinals;
import enums.Colors;
import interfaces.PixelInterface;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Pixel implements PixelInterface {
    private int y;
    private int x;
    private Color color;

    @Override
    public Map<String, Cardinals> getNeighbors() {
        return new HashMap<>() {{
            put("N", Cardinals.NORTH);
            put("NE", Cardinals.NORTH_EAST);
            put("NW", Cardinals.NORTH_WEST);
            put("S", Cardinals.SOUTH);
            put("SE", Cardinals.SOUTH_EAST);
            put("SW", Cardinals.SOUTH_WEST);
            put("E", Cardinals.EAST);
            put("W", Cardinals.WEST);
        }};
    }

    @Override
    public void setCoordinates(int y, int x) {
        this.y =y;
        this.x = x;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    public void setColor(Colors colors) {
        this.color = new Color(colors.getR(), colors.getG(), colors.getB());
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
