public class OrderPrinter {
    public void printOrder(Order order) {
        System.out.println("Замовлення:");
        System.out.println("Загальна сума: "
                + order.calculateTotal());
    }
}
