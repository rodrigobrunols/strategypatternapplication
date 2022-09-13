package com.lab.applications.strategypatternapplication.exception;

import com.lab.applications.strategypatternapplication.type.NotificationType;

public class NotificationStrategyNotFoundException extends Exception {
    public NotificationStrategyNotFoundException(String s, NotificationType notificationType) {
        super(String.format("%s%s", s, notificationType));
    }
}
