package classes;

import enums.Colors;

public class Drawer2DShape extends Drawer {
    public void drawSquare(Pixel[][] pixels, int scale, Colors color) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                int i1 = (pixels.length - (pixels.length / scale)) - 1;
                if (i == pixels.length / scale || i == i1) {
                    if (j >= (pixels[i].length / scale) && j <= (pixels[i].length - (pixels[i].length / scale)) - 1) {
                        pixels[i][j].setColor(color);
                    }
                } else if (i > (pixels.length / scale) - 1 && i < i1) {
                    if (j == (pixels[i].length / scale) || j == (pixels[i].length - (pixels[i].length / scale)) - 1) {
                        pixels[i][j].setColor(color);
                    }
                }
            }
        }
    }
}