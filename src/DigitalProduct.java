public class DigitalProduct implements Product, Digital {
    private String name;
    private double price;
    private String downloadLink;

    public DigitalProduct(String name, double price, String downloadLink) {
        this.name = name;
        this.price = price;
        this.downloadLink = downloadLink;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscountPrice() {
        return price * 0.9; // 10% знижка
    }

    @Override
    public String getDownloadLink() {
        return downloadLink;
    }
}
