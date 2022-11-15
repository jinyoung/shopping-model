
package shopping.model.event;


import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DeliveryStartedEvent{

    private Long id;
    private String address;
    private Integer qty;
    private Long orderId;

}
