package Managers;

import Models.DeliveryMetaData;
import Models.DeliveryPartner;

public class StrategyMgr {
    private static StrategyMgr strategyMgrInstance;

    private StrategyMgr() {}

    public static synchronized StrategyMgr getStrategyMgr() {
        if (strategyMgrInstance == null) {
            strategyMgrInstance = new StrategyMgr();
        }
        return strategyMgrInstance;
    }

    public DeliveryPartner determineDeliveryPartner(DeliveryMetaData metaData) {
        // Strategy logic to choose the best delivery partner
        return new DeliveryPartner("Best Partner");
    }
}
