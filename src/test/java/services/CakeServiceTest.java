package services;

import models.Cake;
import models.Macaron;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CakeServiceTest {

@Test
        public void createTest() {
   //(1)
    String expectedName = "Strawberry";
    int expectedId = 3;
    String expectedFilling = "Chocolate";
    int expectedSize = 30;
    float expectedPrice = 45;
    Cake cake = new Cake(expectedId, expectedName,expectedFilling, expectedSize, expectedPrice);


    // (2)
    CakeService cakeService = new CakeService();
    Cake testCake = CakeService.create(expectedName,expectedId,
            expectedFilling, expectedSize, expectedPrice);

    // (3)

    int actualId = testCake.getId();
    String actualName = testCake.getName();
    String actualFilling = testCake.getFilling();
    int actualSize =testCake.getSize();
    float actualPrice = testCake.getPrice();

    // (4)
    Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
    Assertions.assertEquals(expectedName, actualName);
    Assertions.assertEquals(expectedFilling, actualFilling);
    Assertions.assertEquals(expectedSize, actualSize);
    Assertions.assertEquals(expectedPrice, actualPrice);

    }


    @Test
    public void findTest() {
        CakeService cakeService = new CakeService();
        Cake expected = CakeService.create("Strawberry", 1, "Chocolate", 10, 30);
        int id = expected.getId();
        Cake actual = cakeService.findCake(id);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest(){
        CakeService cakeService = new CakeService();
        Cake expected = CakeService.create("Strawberry", 1, "Chocolate", 10, 30);
        int id = expected.getId();
        boolean actual = cakeService.delete(id);
        Assertions.assertTrue(actual);
        Cake actualCake = cakeService.findCake(id);
        Assertions.assertNull(actualCake);
    }






}
