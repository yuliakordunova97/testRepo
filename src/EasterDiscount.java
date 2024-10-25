public class EasterDiscount implements Discount {
    @Override
    public double applyDiscount(Product product) {
        return product.getPrice() * 0.8; // 20% знижка на Великдень
    }
}