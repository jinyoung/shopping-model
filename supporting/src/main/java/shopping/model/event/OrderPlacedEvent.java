
package shopping.model.event;


import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class OrderPlacedEvent{

    private Long id;
    private String productId;
    private Integer qty;
    private String address;

}
