package testing;

import BattleCity.Enemy;
import BattleCity.Position;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnemyMovementTest {
    @Test
    public void xShouldMoveByOnePositive (){
        //Given
        int expectedX = 2;
        Enemy enemy = new Enemy(new Position(1, 1), 1, 0);

        //When
        enemy.move();

        //Then
        Assert.assertEquals(expectedX, enemy.getPosition().getX());
    }

    @Test
    public void xShouldMoveByOneNegative () {
        //Given
        int expectedX = 0;
        Enemy enemy = new Enemy(new Position(1, 1), -1, 0);

        //When
        enemy.move();

        //Then
        Assert.assertEquals(expectedX, enemy.getPosition().getX());
    }

    @Test
    public void yShouldMoveByOnePositive () {
        //Given
        int expectedY = 2;
        Enemy enemy = new Enemy(new Position(1, 1), 0, 1);

        //When
        enemy.move();

        //Then
        Assert.assertEquals(expectedY, enemy.getPosition().getY());
    }

    @Test
    public void yShouldMoveByOneNegative () {
        //Given
        int expectedY = 0;
        Enemy enemy = new Enemy(new Position(1, 1), 0, -1);

        //When
        enemy.move();

        //Then
        Assert.assertEquals(expectedY, enemy.getPosition().getY());
    }

}