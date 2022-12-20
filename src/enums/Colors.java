package enums;

import java.awt.*;

public enum Colors {
    WHITE(255, 255, 255),
    BLACK(0, 0, 0),
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0);

    int r;
    int g;
    int b;
    Colors(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public static Color getRandomColor() {
        int randomNumber = (int) (Math.random() * 6);
        switch(randomNumber) {
            case 1: return new Color(BLACK.getR(), BLACK.getG(), BLACK.getB());
            case 2: return new Color(RED.getR(), RED.getG(), RED.getB());
            case 3: return new Color(GREEN.getR(), GREEN.getG(), GREEN.getB());
            case 4: return new Color(BLUE.getR(), BLUE.getG(), BLUE.getB());
            case 5: return new Color(YELLOW.getR(), YELLOW.getG(), YELLOW.getB());
            default: return new Color(WHITE.getR(), WHITE.getG(), WHITE.getB());
        }
    }
}
