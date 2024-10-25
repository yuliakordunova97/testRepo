import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<PhysicalProduct> physicalProducts = new ArrayList<>();
    private List<DigitalProduct> digitalProducts = new ArrayList<>();

    public void addPhysicalProduct(PhysicalProduct product) {
        physicalProducts.add(product);
    }

    public void addDigitalProduct(DigitalProduct product) {
        digitalProducts.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (PhysicalProduct product : physicalProducts) {
            total += product.getDiscountPrice();
        }
        for (DigitalProduct product : digitalProducts) {
            total += product.getDiscountPrice();
        }
        return total;
    }
}
