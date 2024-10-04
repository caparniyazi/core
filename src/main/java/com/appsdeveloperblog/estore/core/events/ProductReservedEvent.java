package com.appsdeveloperblog.estore.core.events;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class ProductReservedEvent {
    // Data fields
    private final String productId;
    private final int quantity;
    private final String orderId;
    private final String userId;
}
