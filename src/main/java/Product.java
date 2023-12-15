import lombok.Builder;
import lombok.With;

@With
@Builder
public record Product(
        String id,
        String name
) {
}
