package classes;

import enums.Cardinals;
import enums.Colors;
import interfaces.PixelInterface;

import java.awt.*;
import java.util.ArrayList;

public class Pixel implements PixelInterface {
    private int y;
    private int x;
    private Color color;

    public Pixel(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public ArrayList<Pixel> getNeighbors(Pixel[][] pixels) {
        Cardinals[] cardinals = new Cardinals[] {
                Cardinals.NORTH,
                Cardinals.NORTH_EAST,
                Cardinals.NORTH_WEST,
                Cardinals.SOUTH,
                Cardinals.SOUTH_EAST,
                Cardinals.SOUTH_WEST,
                Cardinals.EAST,
                Cardinals.WEST
        };
        ArrayList<Pixel> neighbor = new ArrayList<>();
        for (Cardinals cardinal : cardinals) {
            try {
                neighbor.add(pixels[y + cardinal.getY()][x + cardinal.getX()]);
            } catch (NullPointerException | IndexOutOfBoundsException ignored) { }
        }
        return neighbor;
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

    public void smoothing(Pixel[][] pixels) {
        int rS = 0;
        int gS = 0;
        int bS = 0;
        int neighborsSize = getNeighbors(pixels).size();
        for (int i = 0; i < neighborsSize; i++) {
            try {
                Pixel neighbor = pixels[y + getNeighbors(pixels).get(i).getY()][x + getNeighbors(pixels).get(i).getX()];
                rS += neighbor.getColor().getRed();
                gS += neighbor.getColor().getGreen();
                bS += neighbor.getColor().getBlue();
            } catch (NullPointerException | IndexOutOfBoundsException ignored) { }
        }
        color = new Color(rS / neighborsSize, gS / neighborsSize, bS / neighborsSize);
    }
}
