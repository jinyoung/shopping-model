package shopping.model.external;



import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Order {

    private Long id;
    private String productId;
    private Integer qty;
    private String address;
    private String status;

}

