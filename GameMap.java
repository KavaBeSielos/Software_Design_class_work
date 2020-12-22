package BattleCity;

public class GameMap {
    private int MAP[][] = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1},
            {1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1},
            {1, 0, 2, 0, 2, 0, 2, 3, 2, 0, 2, 0, 2, 0, 1},
            {1, 0, 2, 0, 2, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1},
            {1, 2, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 2, 1},
            {1, 3, 0, 2, 2, 0, 0, 0, 0, 0, 2, 2, 0, 3, 1},
            {1, 0, 0, 0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 1},
            {1, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 1},
            {1, 0, 2, 0, 2, 0, 0, 0, 0, 0, 2, 0, 2, 0, 1},
            {1, 0, 2, 0, 2, 0, 2, 2, 2, 0, 2, 0, 2, 0, 1},
            {1, 0, 0, 0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public boolean isAvailable(int y, int x) {
        return MAP[y][x] == 0;
    }

    public boolean isOuterWall(int y, int x) {
        return MAP[y][x] == 1;
    }

    public boolean isEmptySpace(int y, int x) {
        return MAP[y][x] == 0;
    }

    public boolean isDestructableWall(int y, int x) {
        return MAP[y][x] == 2;
    }

    public boolean isIndestructableWall(int y, int x) {
        return MAP[y][x] == 3;
    }

    public boolean isPlayerBase(int y, int x) {
        return MAP[y][x] == 4;
    }

    public int width() {
        return MAP.length;
    }

    public int height() {
        return MAP[0].length;
    }

    public boolean isAvailable(Position position) {
        return isAvailable(position.getY(), position.getX());
    }
}
