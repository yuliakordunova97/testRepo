public class DiscountService {
    public double calculateDiscount(Product product, Discount discount) {
        return discount.applyDiscount(product);
    }
}
