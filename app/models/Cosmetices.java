package models;

/**
 * Created by Admin on 13/8/2561.
 */
public class Cosmetices {
    private String id, name,brand, category, amount, color, mfg, exp;
    private double price;

    public Cosmetices () {}


    public Cosmetices(String id, String name, String brand, String category, String amount, String color, String mfg, String exp, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.amount = amount;
        this.color = color;
        this.mfg = mfg;
        this.exp = exp;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMfg() {
        return mfg;
    }

    public void setMfg(String mfg) {
        this.mfg = mfg;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

