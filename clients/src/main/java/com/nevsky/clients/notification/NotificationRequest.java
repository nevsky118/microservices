package com.nevsky.clients.notification;

public record NotificationRequest(Integer toCustomerId, String toCustomerName, String message) {
}
