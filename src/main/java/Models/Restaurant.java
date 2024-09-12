package Models;

public class Restaurant {
    private String name;
    private Menu menu;
    private Location location;

    public Restaurant(String name, Location location, Menu menu) {
        this.name = name;
        this.location = location;
        this.menu = menu;
    }

    public boolean prepareFood(String orderId) {
        System.out.println("Restaurant " + name + " is preparing food for order " + orderId);
        return true;
    }

    public Menu getMenu() {
        return menu;
    }
}