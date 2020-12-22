package BattleCity;

import java.util.List;

public class GameLevel {

    private GameMap gameMap;

    private Tank tank;

    private List<Enemy> enemys;

    private List<Bullets> bulletss;

    public GameLevel(GameMap map, Tank tank, List<Enemy> enemys, List<Bullets> bulletss) {
        setGameMap(map);
        setTank(tank);
        setEnemys(enemys);
        setBulletss(bulletss);
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public List<Enemy> getEnemys() {
        return enemys;
    }

    public void setEnemys(List<Enemy> enemys) {
        this.enemys = enemys;
    }

    public List<Bullets> getBulletss() {
        return bulletss;
    }

    public void setBulletss(List<Bullets> bulletss) {
        this.bulletss = bulletss;
    }
}
