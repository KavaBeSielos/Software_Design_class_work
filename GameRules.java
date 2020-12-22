package BattleCity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

public class GameRules {

    private final GameLevel level;

    ConsoleInput consoleInput = new ConsoleInput();

    private boolean gameOver = false;

    public GameRules(GameLevel level) {
        this.level = level;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean enemyCollision() {
        boolean result = false;
        for (Enemy enemy : level.getEnemys())
            result = result || enemyCollision(level.getTank(), enemy);
        return result;
    }

    public static boolean enemyCollision(Tank tank, Enemy enemy) {
        return enemy.getPosition().equals(tank.getPosition());
    }

    public void processUserInput(int key) throws IOException {
        switch (key) {
            case 'a':
                if (level.getGameMap().isAvailable(level.getTank().getPosition().moveLeft()))
                    level.getTank().setPosition(level.getTank().getPosition().moveLeft());
                break;
            case 'd':
                if (level.getGameMap().isAvailable(level.getTank().getPosition().moveRight()))
                    level.getTank().setPosition(level.getTank().getPosition().moveRight());
                break;
            case 'w':
                if (level.getGameMap().isAvailable(level.getTank().getPosition().moveUp()))
                    level.getTank().setPosition(level.getTank().getPosition().moveUp());
                break;
            case 's':
                if (level.getGameMap().isAvailable(level.getTank().getPosition().moveDown()))
                    level.getTank().setPosition(level.getTank().getPosition().moveDown());
                break;
            case 'f':
                //System.out.print("Enter Bullet Direction a,d,w,s");
                int dir = consoleInput.userInput();
                switch (dir) {
                    case 'a':
                        level.getBulletss().add(new Bullets(level.getTank().getPosition(), -1, 0));
                        break;
                    case 'd':
                        level.getBulletss().add(new Bullets(level.getTank().getPosition(), 1, 0));
                        break;
                    case 'w':
                        level.getBulletss().add(new Bullets(level.getTank().getPosition(), 0, -1));
                        break;
                    case 's':
                        level.getBulletss().add(new Bullets(level.getTank().getPosition(), 0, 1));
                        break;
                }
                break;
            case 'q':
                System.exit(0);
        }

    }

    public void enemysMovement() {
        for (Enemy enemy : level.getEnemys())
            enemyMovement(enemy);
    }

    private void enemyMovement(Enemy enemy) {
        if (!level.getGameMap().isAvailable(enemy.getNextMove())) {
            enemy.changeDirectionDx();
            enemy.changeDirectionDy();
        }


        enemy.move();
    }


    public void bulletsMovement() {

        int temp = 0;
        for (Bullets bullets : level.getBulletss()) {
            if (!level.getGameMap().isAvailable(bullets.getNextMove())) {
                temp = level.getBulletss().indexOf(bullets);
                level.getBulletss().remove(temp);
                bulletsMovement();
                break;
            } else bullets.move();

        }


    }
}
