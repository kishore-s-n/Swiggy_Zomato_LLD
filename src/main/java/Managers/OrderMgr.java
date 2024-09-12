package Managers;


import Models.DeliveryMetaData;
import Models.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderMgr {
    private static OrderMgr orderMgrInstance;
    private Map<String, Order> orders;

    private OrderMgr() {
        orders = new HashMap<>();
    }

    public static synchronized OrderMgr getOrderMgr() {
        if (orderMgrInstance == null) {
            orderMgrInstance = new OrderMgr();
        }
        return orderMgrInstance;
    }

    public void createOrder(String orderId, Order order) {
        orders.put(orderId, order);
    }

    public Order getOrder(String orderId) {
        return orders.get(orderId);
    }
}
