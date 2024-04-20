package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CakeTest {
    @Test
    public void Cake(){
        String expectedName = "Strawberry";
        int expectedId = 3;
        String expectedFilling = "Chocolate";
        int expectedSize = 30;
        float expectedPrice = 45;
        Cake cake = new Cake(expectedName, expectedId, expectedFilling, expectedSize, expectedPrice );

        Assertions.assertEquals(expectedName, cake.getName());
        Assertions.assertEquals(expectedId, cake.getId());
        Assertions.assertEquals(expectedFilling, cake.getFilling());
        Assertions.assertEquals(expectedSize,cake.getSize());
        Assertions.assertEquals(expectedPrice,cake.getPrice());






    }

    @Test
    public void setNameTest() {
        // given (1)
        Cake cake = new Cake("CarrotCake", 1, "butterCream", 20, 40);


        // when (2)
        String expected = "CarrotCake";
        String actual = cake.getName();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }
   @ Test
   public void setIdTest() {
        // given (1)
        Cake cake = new Cake("CarrotCake", 2, "butterCream", 20, 40);


        // when (2)
        int expected = 2;
        int actual = cake.getId();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void setFillingTest() {
        Cake cake = new Cake("CarrotCake", 1, "Vanilla", 20, 40);


        // when (2)
        String expected = "Vanilla";
        String actual = cake.getFilling();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setSizeTest() {
        Cake cake = new Cake("CarrotCake", 1, "Vanilla", 20, 40);


        // when (2)
        int expected = 20;
        int actual = cake.getSize();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setPriceTest() {
        Cake cake = new Cake("CarrotCake", 1, "Vanilla", 20, 45);


        // when (2)
        float expected = 45;
        float actual = cake.getPrice();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }
}


