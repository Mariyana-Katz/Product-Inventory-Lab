package models;

public class Cake {
    private int id;
    private String name;
    private String filling;
    private String icing;
    private int size;
    private float price;

    public Cake(String name, int id, String filling, int size, float price) {
        this.name = name;
        this.id = id;
        this.filling = filling;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
