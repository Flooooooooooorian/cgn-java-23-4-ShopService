import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ShopService {
    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderListRepo();

    public Order addOrder(List<String> productIds) {
        List<Product> products = new ArrayList<>();
        for (String productId : productIds) {

            Optional<Product> productToOrder = productRepo.getProductById(productId);

            if (productToOrder.isEmpty()) {
                System.out.println("Product mit der Id: " + productId + " konnte nicht bestellt werden!");
                return null;
            }

            products.add(productToOrder.get());
        }

        Order newOrder = new Order();
        newOrder.setId(UUID.randomUUID().toString());
        newOrder.setProducts(products);
        newOrder.setStatus(OrderStatus.IN_PROCESS);

        return orderRepo.addOrder(newOrder);
    }

}
