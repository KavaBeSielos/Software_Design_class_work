package BattleCity;

public class Bullets {
    public static int bulletSpeed = 1;
    private boolean bulletLive = true;
    private Position position;
    int bulletDx = 0;
    int bulletDy = 0;

    public Bullets(Position position, int dx, int dy) {
        this.position = position;
        this.bulletDx = dx;
        this.bulletDy = dy;
    }

    public Bullets(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public boolean at(int y, int x) {
        return position.getY() == y && position.getX() == x;
    }


    public void changeDirectionDx(int dir) {
        bulletDx += dir;
    }

    public void changeDirectionDy(int dir) {
        bulletDy += dir;
    }

    public void move(){
        position.setX(bulletDx + this.position.getX());
        position.setY(bulletDy + this.position.getY());
    }

    public Position getNextMove() {
        return new Position(position).addX(bulletDx).addY(bulletDy);
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
