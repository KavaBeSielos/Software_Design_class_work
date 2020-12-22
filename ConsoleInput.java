package BattleCity;

import java.io.IOException;

public class ConsoleInput {

    public int userInput() throws IOException {
        int key = 0;
        key = System.in.read();
        return key;
    }

}
