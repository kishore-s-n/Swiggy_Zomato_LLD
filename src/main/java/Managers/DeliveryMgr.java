package Managers;

import Models.DeliveryMetaData;
import Models.DeliveryPartner;

public class DeliveryMgr {
    private static DeliveryMgr deliveryMgrInstance;

    private DeliveryMgr() {}

    public static synchronized DeliveryMgr getDeliveryMgr() {
        if (deliveryMgrInstance == null) {
            deliveryMgrInstance = new DeliveryMgr();
        }
        return deliveryMgrInstance;
    }

    public void manageDelivery(String orderId, DeliveryMetaData metaData) {
        DeliveryPartner deliveryPartner = new DeliveryPartner("John Doe");
        deliveryPartner.performDelivery(orderId, metaData);
    }
}

