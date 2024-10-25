public class ChristmasDiscount implements Discount {
    @Override
    public double applyDiscount(Product product) {
        return product.getPrice() * 0.9; // 10% знижка на Різдво
    }
}
