package services;

import models.Cake;
import models.Macaron;

import java.util.ArrayList;

public class CakeService {
    private static int nextId = 1;  // (1)

    private static ArrayList<Cake> inventory = new ArrayList<>();  // (2)
    public static Cake create(String Name, int expectedId, String Filling, int Size, float Price) {
        Cake createdCake = new Cake( nextId++,Name, Filling, Size, Price);

        // (3)
        inventory.add(createdCake);

        // (4)
        return createdCake;
    }

    public Cake findCake(int id) {
        for (Cake cake : inventory) {
            if (cake.getId() == id) {
                return cake;
            }
        }
        return null;
    }



    public Cake[] findAllCake(){
        return inventory.toArray(new Cake[inventory.size()]);
    }
    // should remove the object with this id from the ArrayList if exits and return true.
    // Otherwise return false

    public boolean delete(int id) {

        for(Cake cake: inventory){
            if(cake.getId() == id){
                inventory.remove(cake);
                return true;
            }
        }
        return false;
    }
}
