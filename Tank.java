package BattleCity;

public class Tank {

    private Position position;
    private Bullets bullets;

    public Tank(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}