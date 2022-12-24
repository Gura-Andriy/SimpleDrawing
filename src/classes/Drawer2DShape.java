package classes;

import enums.Colors;

public class Drawer2DShape extends Drawer {
    public void drawSquare(Pixel[][] pixels, int scale, Colors color) {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[y].length; x++) {
                int i1 = (pixels.length - (pixels.length / scale)) - 1;
                if (y == pixels.length / scale || y == i1) {
                    if (x >= (pixels[y].length / scale) && x <= (pixels[y].length - (pixels[y].length / scale)) - 1) {
                        pixels[y][x].setColor(color);
                    }
                } else if (y > (pixels.length / scale) - 1 && y < i1) {
                    if (x == (pixels[y].length / scale) || x == (pixels[y].length - (pixels[y].length / scale)) - 1) {
                        pixels[y][x].setColor(color);
                    }
                }
            }
        }
    }
}