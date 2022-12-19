package classes;

import enums.Colors;

public class Drawer2DShape extends Drawer {
    public void drawSquare(Colors[][] array, int scale, Colors color) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int i1 = (array.length - (array.length / scale)) - 1;
                if (i == array.length / scale || i == i1) {
                    if (j >= (array[i].length / scale) && j <= (array[i].length - (array[i].length / scale)) - 1) {
                        array[i][j] = color;
                    }
                } else if (i > (array.length / scale) - 1 && i < i1) {
                    if (j == (array[i].length / scale) || j == (array[i].length - (array[i].length / scale)) - 1) {
                        array[i][j] = color;
                    }
                }
            }
        }
    }
}