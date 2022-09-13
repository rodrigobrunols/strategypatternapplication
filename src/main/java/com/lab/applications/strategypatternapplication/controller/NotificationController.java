package com.lab.applications.strategypatternapplication.controller;

import com.lab.applications.strategypatternapplication.NotificationContext;
import com.lab.applications.strategypatternapplication.exception.NotificationStrategyNotFoundException;
import com.lab.applications.strategypatternapplication.type.NotificationType;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class NotificationController {

    private final NotificationContext notificationContext;

    @GetMapping public String sendNotification(@RequestParam String message,
                                               @RequestParam NotificationType notificationType)
            throws NotificationStrategyNotFoundException{

        notificationContext.sendMessage(message,notificationType);

        return message;
    }
}
