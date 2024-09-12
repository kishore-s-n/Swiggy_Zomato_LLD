package Models;

public class Dish {
    private String name;
    private String description;
    private String cuisine;
    private double price;

    public Dish(String name, String cuisine, double price) {
        this.name = name;
        this.cuisine = cuisine;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getPrice() {
        return price;
    }
}
