package shopping.model.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;


import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class RegisterProductCommand {

    @TargetAggregateIdentifier
    private Long id;
    private String name;
    private Long qty;

}
