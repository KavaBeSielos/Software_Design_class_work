package BattleCity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

    static boolean gameOver = false;

    public static void main(String[] args) throws IOException {

        GameMap map = new GameMap();
        List<Bullets> bulletss = new ArrayList<Bullets>();

        List<Enemy> enemys = new ArrayList<Enemy>();

        enemys.add(new Enemy(new Position(1, 1), 1, 0));
        enemys.add(new Enemy(new Position(13, 1), 0, 1));

        Tank tank = new Tank(new Position(3, 3));

        GameLevel level = new GameLevel(map, tank, enemys, bulletss);

        GameRenderer renderer = new GameRenderer();

        GameRules gameRules = new GameRules(level);

        ConsoleInput consoleInput = new ConsoleInput();

        while (!gameOver) {

            renderer.renderMap(level);


            int key = consoleInput.userInput();

            gameRules.processUserInput(key);

            gameRules.bulletsMovement();

            gameRules.enemysMovement();


            if (gameRules.enemyCollision()) gameOver = true;

        }
        System.out.println("Press any key to continue");
        System.in.read();
    }


}

