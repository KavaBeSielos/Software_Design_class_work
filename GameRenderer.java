package BattleCity;

public class GameRenderer {

    //0 = emptyspace
    //1 = outerwall
    //2 = destructable wall
    //3 = indestructable wall
    //4 = player base
    //T = player
    //E = enemy

    public void renderMap(GameLevel gameLevel) {

        for (int y = 0; y < gameLevel.getGameMap().width(); y++) {
            for (int x = 0; x < gameLevel.getGameMap().height(); x++) {
                for (Enemy enemy : gameLevel.getEnemys()) {
                    if (enemy.at(y, x)) {
                        System.out.print("E");
                        x++;
                        continue;
                    }
                }
                for (Bullets bullets : gameLevel.getBulletss()) {
                    if (bullets.at(y, x)) {
                        System.out.print("B");
                        x++;
                        continue;
                    }
                }
                if (gameLevel.getTank().getPosition().at(x, y))
                    System.out.print("T");
                else if (gameLevel.getGameMap().isOuterWall(y, x))
                    System.out.print("#");
                else if (gameLevel.getGameMap().isEmptySpace(y, x))
                    System.out.print(" ");
                else if (gameLevel.getGameMap().isDestructableWall(y, x))
                    System.out.print("+");
                else if (gameLevel.getGameMap().isIndestructableWall(y, x))
                    System.out.print("*");
                else if (gameLevel.getGameMap().isPlayerBase(y, x))
                    System.out.print("&");
            }

            System.out.println();
        }

    }
}
