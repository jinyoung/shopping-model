package shopping.model.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import static org.axonframework.modelling.command.AggregateLifecycle.*;
import org.axonframework.spring.stereotype.Aggregate;

import org.springframework.beans.BeanUtils;
import java.util.List;

import lombok.Data;
import lombok.ToString;



import shopping.model.command.*;
import shopping.model.event.*;


@Aggregate
@Data
@ToString
public class DeliveryAggregate {

    @AggregateIdentifier
    private Long id;
    private String address;
    private Integer qty;
    private Long orderId;

    public DeliveryAggregate(){}







    @EventSourcingHandler
    public void on(DeliveryStartedEvent event) {
        BeanUtils.copyProperties(event, this);
    }


}
