package services;

import models.Macaron;

import java.util.ArrayList;

    public class MacaronsService {
    private static int nextId = 1;  // (1)

    private static ArrayList<Macaron> inventory = new ArrayList<>();  // (2)
    public static Macaron create(String Name, int expectedId, String Filling, int Qty, float Price) {
        Macaron createdMacarons = new Macaron( nextId++,Name, Filling, Qty, Price);

        // (3)
        inventory.add(createdMacarons);

        // (4)
        return createdMacarons;
    }

//        read
//        public Sneaker findSneaker(int id) {
//            // should take an int and return an object with that id, if exists

        public Macaron findMacarons(int id) {
            for (Macaron macarons : inventory) {
                if (macarons.getId() == id) {
                    return macarons;
                }
            }
            return null;
        }

        public Macaron[] findAllMacarons(){
            return inventory.toArray(new Macaron[inventory.size()]);
        }
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        public boolean delete(int id) {

            for(Macaron macaron: inventory){
                if(macaron.getId() == id){
                    inventory.remove(macaron);
                    return true;
                }
            }
            return false;
        }

    }