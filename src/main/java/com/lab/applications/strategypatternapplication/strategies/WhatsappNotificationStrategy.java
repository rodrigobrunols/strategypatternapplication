package com.lab.applications.strategypatternapplication.strategies;

import com.lab.applications.strategypatternapplication.type.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import static com.lab.applications.strategypatternapplication.type.NotificationType.EMAIL;

@Slf4j
@Component
public class WhatsappNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Envia mensagem no Whatsapp: " + message) ;

    }

    @Override
    public NotificationType notificationType() {
        return EMAIL;
    }
}
