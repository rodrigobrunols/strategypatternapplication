package com.lab.applications.strategypatternapplication;

import com.lab.applications.strategypatternapplication.exception.NotificationStrategyNotFoundException;
import com.lab.applications.strategypatternapplication.strategies.NotificationStrategy;
import com.lab.applications.strategypatternapplication.type.NotificationType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Component
@Slf4j
public class NotificationContext {

    private final Map<NotificationType, NotificationStrategy> sendNotificationByType;

    public void sendMessage(String message, NotificationType notificationType) throws NotificationStrategyNotFoundException {

        NotificationStrategy strategy = sendNotificationByType.getOrDefault(notificationType, null);

        if(Objects.isNull(strategy)) {
            throw new NotificationStrategyNotFoundException("Notification Type not found! " , notificationType);
        }

        strategy.sendMessage(message);
    }
}
