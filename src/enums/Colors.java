package enums;

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

    public static Colors getRandomColor() {
        int randomNumber = (int) (Math.random() * 6);
        switch(randomNumber) {
            case 1: return BLACK;
            case 2: return RED;
            case 3: return GREEN;
            case 4: return BLUE;
            case 5: return YELLOW;
            default: return WHITE;
        }
    }
}
