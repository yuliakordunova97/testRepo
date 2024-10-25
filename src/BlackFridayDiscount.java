public class BlackFridayDiscount implements Discount {
    @Override
    public double applyDiscount(Product product) {
        return product.getPrice() * 0.7; // 30% знижка на Чорну п'ятницю
    }
}
