package models;

/**
 * Created by Admin on 28/7/2561.
 */
public class Makeup {
    private String id;
    private String name;
    private String brand;
    private String category;
    private String amount;
    private double price;

    public Makeup () {
    }

    public Makeup(String id, String name, String brand, String category, String amount, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.amount = amount;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
