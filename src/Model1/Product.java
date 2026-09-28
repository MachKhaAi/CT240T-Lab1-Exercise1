
public abstract class Product {

    // Thuoc tinh
    private String id;
    private String name;
    private double price;

    // Constructor
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        setPrice(price);
    }

    // Phuong thuc truu tuong
    public abstract double calculateFinalPrice();

    // Getter va Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter va Setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter va Setter cho price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException(
                    "Gia san pham khong duoc am"
            );
        }

        this.price = price;
    }
}
