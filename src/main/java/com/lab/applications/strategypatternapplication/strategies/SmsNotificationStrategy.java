package com.lab.applications.strategypatternapplication.strategies;

import com.lab.applications.strategypatternapplication.type.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Envia mensagem por sms: " + message) ;

    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
