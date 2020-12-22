package testing;

import BattleCity.Tank;
import BattleCity.Position;
import org.junit.Assert;
import org.junit.Test;

public class TankMovementTest {
    @Test
    public void xShouldMoveByOnePositive (){
        //Given
        int expectedX = 3;
        Tank tank = new Tank(new Position(1, 1));

        //When
        tank.setPosition(tank.getPosition().moveRight());

        //Then
        Assert.assertEquals(expectedX, tank.getPosition().getX());
    }

    @Test
    public void xShouldMoveByOneNegative () {
        //Given
        int expectedX = 0;
        Tank tank = new Tank(new Position(1, 1));

        //When
        tank.setPosition(tank.getPosition().moveLeft());

        //Then
        Assert.assertEquals(expectedX, tank.getPosition().getX());
    }

    @Test
    public void yShouldMoveByOnePositive () {
        //Given
        int expectedY = 0;
        Tank tank = new Tank(new Position(1, 1));

        //When
        tank.setPosition(tank.getPosition().moveUp());

        //Then
        Assert.assertEquals(expectedY, tank.getPosition().getY());
    }

    @Test
    public void yShouldMoveByOneNegative () {
        //Given
        int expectedY = 2;
        Tank tank = new Tank(new Position(1, 1));

        //When
        tank.setPosition(tank.getPosition().moveDown());

        //Then
        Assert.assertEquals(expectedY, tank.getPosition().getY());
    }

}
