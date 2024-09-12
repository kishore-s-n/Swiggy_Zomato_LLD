package Managers;

import java.util.HashMap;
import java.util.Map;

public class NotificationMgr {
    private static NotificationMgr notificationMgrInstance;
    private Map<String, String> notifications;

    private NotificationMgr() {
        notifications = new HashMap<>();
    }

    public static synchronized NotificationMgr getNotificationMgr() {
        if (notificationMgrInstance == null) {
            notificationMgrInstance = new NotificationMgr();
        }
        return notificationMgrInstance;
    }

    public void notifyUser(String userId, String msg) {
        notifications.put(userId, msg);
        System.out.println("Notification sent to " + userId + ": " + msg);
    }
}

