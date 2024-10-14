package com.appsdeveloperblog.estore.core.events;

import lombok.*;

@Value
public class PaymentProcessedEvent {
    private final String orderId;
    private final String paymentId;
}
