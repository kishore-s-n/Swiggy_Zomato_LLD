package Managers;

import Models.Restaurant;

public class FoodMgr {
    private static FoodMgr foodMgrInstance;

    private FoodMgr() {}

    public static synchronized FoodMgr getFoodMgr() {
        if (foodMgrInstance == null) {
            foodMgrInstance = new FoodMgr();
        }
        return foodMgrInstance;
    }

    public void prepareFood(String orderId, Restaurant restaurant) {
        restaurant.prepareFood(orderId);
    }
}
