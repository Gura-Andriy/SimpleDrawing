public class ShapeDrawer2D extends Drawer {
    public void drawSquare(byte[][] array, int scale) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int i1 = (array.length - (array.length / scale)) - 1;
                if (i == array.length / scale || i == i1) {
                    if (j >= (array[i].length / scale) - 1 && j <= (array[i].length - (array[i].length / scale)) - 1) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                } else if (i > (array.length / scale) - 1 && i < i1) {
                    if (j == (array[i].length / scale) - 1 || j == (array[i].length - (array[i].length / scale)) - 1) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }
}