package services;

import models.Macaron;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MacaronsServiceTest {
    @Test
    public void createTest() {
        //(1)
        String expectedName = "Coconut";
        int expectedId = 1;
        String expectedFilling = "Chocolate";
        int expectedQty = 10;
        float expectedPrice = 20;
      Macaron macaron = new Macaron(expectedId, expectedName,expectedFilling, expectedQty, expectedPrice);


        // (2)
   MacaronsService macaronsService = new MacaronsService();
        Macaron testMacarons = MacaronsService.create(expectedName,expectedId,
                expectedFilling, expectedQty, expectedPrice);

        // (3)

        int actualId = testMacarons.getId();
        String actualName = testMacarons.getName();
        String actualFilling = testMacarons.getFilling();
        int actualQty =testMacarons.getQty();
        float actualPrice = testMacarons.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedFilling, actualFilling);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }


    @Test
    public void findTest() {
        MacaronsService macaronsService = new MacaronsService();
        Macaron expected = MacaronsService.create("Coconut", 1, "Chocolate", 5, 10);
        int id = expected.getId();
        Macaron actual = macaronsService.findMacarons(id);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest(){
        MacaronsService macaronsService = new MacaronsService();
        Macaron expected = MacaronsService.create("Coconut", 1, "Chocolate", 5, 10);
        int id = expected.getId();
        boolean actual = macaronsService.delete(id);
        Assertions.assertTrue(actual);
        Macaron actualMacaron = macaronsService.findMacarons(id);
        Assertions.assertNull(actualMacaron);
    }

}
