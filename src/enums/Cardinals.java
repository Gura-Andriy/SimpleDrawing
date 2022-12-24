package enums;

public enum Cardinals {
    NORTH(-1, 0, "N"),
    NORTH_EAST(-1, 1, "NE"),
    NORTH_WEST(-1, -1, "NW"),

    SOUTH(1, 0, "S"),
    SOUTH_EAST(1, 1, "SE"),
    SOUTH_WEST(1, -1, "SW"),

    EAST(0, 1, "E"),
    WEST(0, -1, "W");

    String name;
    int y;
    int x;
    Cardinals(int y, int x, String name) {
        this.y = y;
        this.x = x;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
