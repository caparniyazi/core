package com.appsdeveloperblog.estore.core.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
@Data
@Builder
public class ReserveProductCommand {
    // Data fields
    @TargetAggregateIdentifier
    private final String productId;
    private final int quantity;
    private final String orderId;
    private final String userId;
}
