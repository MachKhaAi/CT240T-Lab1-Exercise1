
import java.util.ArrayList;
import java.util.List;

public class ProductInventory {

    private List<Product> products;

    public ProductInventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException(
                    "San pham khong duoc null"
            );
        }

        products.add(product);
    }

    public boolean removeProduct(String id) {
        return products.removeIf(
                product -> product.getId().equals(id)
        );
    }

    public List<Product> findProductByName(String name) {

        List<Product> result = new ArrayList<>();

        if (name == null) {
            return result;
        }

        for (Product product : products) {

            if (product.getName().toLowerCase()
                    .contains(name.toLowerCase())) {

                result.add(product);
            }
        }

        return result;
    }

    public double calculateTotalInventoryValue() {

        double total = 0;

        for (Product product : products) {
            total += product.calculateFinalPrice();
        }

        return total;
    }
}
