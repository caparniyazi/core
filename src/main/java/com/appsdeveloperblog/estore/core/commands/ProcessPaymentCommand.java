package com.appsdeveloperblog.estore.core.commands;

import com.appsdeveloperblog.estore.core.model.PaymentDetails;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
@Builder
@Data
public class ProcessPaymentCommand {
    // Data fields
    @TargetAggregateIdentifier
    private final String paymentId;
    private final String orderId;
    private final PaymentDetails paymentDetails;
}
