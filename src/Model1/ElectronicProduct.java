
public class ElectronicProduct extends Product
        implements Discountable {

    private int warrantyMonths;

    public ElectronicProduct(
            String id,
            String name,
            double price,
            int warrantyMonths) {

        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.10;
    }

    @Override
    public void applyDiscount(double percent) {

        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException(
                    "Phan tram giam gia khong hop le"
            );
        }

        double newPrice =
                getPrice() * (1 - percent / 100);

        setPrice(newPrice);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        if (warrantyMonths < 0) {
            throw new IllegalArgumentException(
                    "Thoi gian bao hanh khong hop le"
            );
        }

        this.warrantyMonths = warrantyMonths;
    }
}
