package shopping.model.event;

import lombok.Data;
import lombok.ToString;



@Data
@ToString
public class InventoryDeductedEvent {

    private Long id;
    private String name;
    private Long qty;

}
