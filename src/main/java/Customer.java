import java.util.List;

public record Customer(
        String id,
        String name,
        List<Order> order
) {
}
