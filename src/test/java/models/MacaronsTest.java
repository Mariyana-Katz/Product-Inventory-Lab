package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MacaronsTest {


    @Test
    public void MacaronsTest(){
        String expectedName = "Coconut";
        int expectedId = 1;
        String expectedFilling = "Chocolate";
        int expectedQty = 5;
        float expectedPrice = 10;
        Macaron macarons  = new Macaron(expectedId, expectedName, expectedFilling, expectedQty, expectedPrice );

        Assertions.assertEquals(expectedName, macarons.getName());
        Assertions.assertEquals(expectedId, macarons.getId());
        Assertions.assertEquals(expectedFilling, macarons.getFilling());
        Assertions.assertEquals(expectedQty,macarons.getQty());
        Assertions.assertEquals(expectedPrice,macarons.getPrice());
    }

    @Test
    public void setNameTest() {
        // given (1)
        Macaron macarons = new Macaron(1, "Coconut", "Chocolate",5, 10);


        // when (2)
        String expected = "Coconut";
        String actual = macarons.getName();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }
    @ Test
    public void setIdTest() {
        // given (1)
        Macaron macarons = new Macaron(1, "Coconut", "Chocolate",5, 10);


        // when (2)
        int expected =1;
        int actual = macarons.getId();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void setFillingTest() {
        Macaron macarons = new Macaron(1, "Coconut", "Chocolate",5, 10);


        // when (2)
        String expected = "Chocolate";
        String actual =macarons.getFilling();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setQtyTest() {
        Macaron macarons = new Macaron(1, "Coconut", "Chocolate",5, 10);


        // when (2)
        int expected = 5;
        int actual = macarons.getQty();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setPriceTest() {
        Macaron macarons = new Macaron(1, "Coconut", "Chocolate",5, 10);


        // when (2)
        float expected = 10;
        float actual = macarons.getPrice();

        // then (3)
        Assertions.assertEquals(expected, actual);
    }



}
