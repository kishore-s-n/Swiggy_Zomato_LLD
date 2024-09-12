import Models.*;
import Managers.*;
import Models.Order;


import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create Restaurant
        Menu menu = new Menu(List.of(new Dish("Pizza", "Italian", 12.99)));
        Restaurant restaurant = new Restaurant("Mario's", new Location(10, 20), menu);

        // Create Order
        String orderId = "ORD123";
        Order order = new Order(orderId);
        OrderMgr.getOrderMgr().createOrder(orderId, order);

        // Prepare Food
        FoodMgr.getFoodMgr().prepareFood(orderId, restaurant);

        // Manage Delivery
        DeliveryMetaData metaData = new DeliveryMetaData(orderId, new Location(5, 5), new Location(10, 20));
        DeliveryMgr.getDeliveryMgr().manageDelivery(orderId, metaData);

        // Send Notification
        NotificationMgr.getNotificationMgr().notifyUser("User123", "Your order has been placed!");
    }
}