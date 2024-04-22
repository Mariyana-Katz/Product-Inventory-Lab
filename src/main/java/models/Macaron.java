package models;

public class Macaron {
    private int id;
    private String name;
    private String filling;
    private int qty;
    private float price;

    public Macaron(){}

    public Macaron(int id, String name, String filling, int qty, float price){
        this.id = id;
        this.name = name;
        this.filling = filling;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
