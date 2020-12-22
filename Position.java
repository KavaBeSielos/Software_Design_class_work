package BattleCity;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position position) {
        this.x = position.x;
        this.y = position.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Position position) {
        return this.x == position.getX() && this.y == position.getY();
    }

    public Position moveLeft() {
        return new Position(x - 1, y);
    }

    public Position moveRight() {
        return new Position(x + 1, y);
    }

    public Position moveUp() {
        return new Position(x, y - 1);
    }

    public Position moveDown() {
        return new Position(x, y + 1);
    }

    public Position addX(int enemyDx) {
        this.x += enemyDx;
        return this;
    }

    public Position addY(int enemyDy) {
        this.y += enemyDy;
        return this;
    }

    public boolean at(int x, int y) {
        return this.x == x && this.y == y;
    }
}
