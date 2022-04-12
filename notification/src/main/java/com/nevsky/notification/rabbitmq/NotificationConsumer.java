package com.nevsky.notification.rabbitmq;

import com.nevsky.clients.notification.NotificationRequest;
import com.nevsky.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(NotificationRequest notificationRequest) {
                log.info("Consumed {} from queue", notificationRequest);
                notificationService.send(notificationRequest);
    }
}
