package Models;

public class DeliveryPartner {
    private String name;

    public DeliveryPartner(String name) {
        this.name = name;
    }

    public void performDelivery(String orderId, DeliveryMetaData metaData) {
        System.out.println("Delivery Partner " + name + " is delivering order " + orderId);
    }
}

