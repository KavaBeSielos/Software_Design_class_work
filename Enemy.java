package BattleCity;

public class Enemy {
    Position position;

    int enemyDx = 1;
    int enemyDy = 0;

    public Enemy(Position position, int dx, int dy) {
        this.position = position;
        this.enemyDx = dx;
        this.enemyDy = dy;
    }

    public boolean at(int y, int x) {
        return position.getY() == y && position.getX() == x;
    }

    public void move() {
        position.setX(enemyDx + position.getX());
        position.setY(enemyDy + position.getY());
    }


    public void changeDirectionDx() {
        enemyDx = -1 * enemyDx;
    }

    public void changeDirectionDy() {
        enemyDy = -1 * enemyDy;
    }

    public Position getPosition() {
        return position;
    }

    public Position getNextMove() {
        return new Position(position).addX(enemyDx).addY(enemyDy);
    }
}
