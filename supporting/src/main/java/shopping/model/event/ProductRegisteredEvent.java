package shopping.model.event;

import lombok.Data;
import lombok.ToString;



@Data
@ToString
public class ProductRegisteredEvent {

    private Long id;
    private String name;
    private Long qty;

}
