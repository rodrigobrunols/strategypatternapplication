package com.lab.applications.strategypatternapplication.config;

import com.lab.applications.strategypatternapplication.strategies.NotificationStrategy;
import com.lab.applications.strategypatternapplication.type.NotificationType;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Configuration
public class StrategyConfig {

    private final List<NotificationStrategy> notificationStrategies;


    @Bean
    public Map<NotificationType, NotificationStrategy> sendNotificationByType() {
        Map<NotificationType, NotificationStrategy> messagesByType = new EnumMap<>(NotificationType.class);

        notificationStrategies.forEach( notificationStrategy ->
                messagesByType.put(notificationStrategy.notificationType(), notificationStrategy));

        return messagesByType;
    }
}
