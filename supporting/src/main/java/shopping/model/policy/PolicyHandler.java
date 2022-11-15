package shopping.model.policy;

import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.axonframework.commandhandling.gateway.CommandGateway;

import shopping.model.command.*;
import shopping.model.event.*;
import shopping.model.aggregate.*;

@Service
@ProcessingGroup("supporting_Policy")
public class PolicyHandler{

    @Autowired
    CommandGateway commandGateway;

    @EventHandler
    public void wheneverOrderPlaced_StartDelivery(OrderPlacedEvent orderPlaced){
        System.out.println(orderPlaced.toString());

        StartDeliveryCommand command = new StartDeliveryCommand();
        commandGateway.send(command);
    }
    @EventHandler
    public void wheneverDeliveryStarted_DeductStock(DeliveryStartedEvent deliveryStarted){
        System.out.println(deliveryStarted.toString());

        DeductStockCommand command = new DeductStockCommand();
        commandGateway.send(command);
    }

}
