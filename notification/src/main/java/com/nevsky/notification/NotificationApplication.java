package com.nevsky.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.nevsky.notification",
                "com.nevsky.amqp",
        }
)
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer, NotificationConfig notificationConfig) {
//        return args -> {
//            producer.publish(new Person("Ali", 18), notificationConfig.getInternalExchange(), notificationConfig.getInternalNotificationRoutingKey());
//        };
//    }
//
//    record Person(String name, int age){}

}