package com.lab.applications.strategypatternapplication.strategies;

import com.lab.applications.strategypatternapplication.type.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SiteNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Envia mensagem pelo site: " + message) ;

    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SITE;
    }
}
