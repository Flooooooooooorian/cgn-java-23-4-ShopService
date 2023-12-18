import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter
//@RequiredArgsConstructor

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private List<Product> products;
    private OrderStatus status;
    private Instant orderedAt;
}
