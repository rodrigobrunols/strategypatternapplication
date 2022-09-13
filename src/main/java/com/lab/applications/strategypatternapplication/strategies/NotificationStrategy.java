package com.lab.applications.strategypatternapplication.strategies;

import com.lab.applications.strategypatternapplication.type.NotificationType;

public interface NotificationStrategy {

    void sendMessage(String message);

     NotificationType notificationType();
}
