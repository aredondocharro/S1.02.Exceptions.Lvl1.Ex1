import java.util.ArrayList;

public class Sale {
    private final ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public double CalculateTotalPrice() throws EmptyShoppingCartException {
        if (products.isEmpty()) {
            throw new EmptyShoppingCartException();
        }
        for (Product products : products) {
            System.out.println(products.toString());
            totalPrice += products.getPrice();
        }
        return totalPrice;
    }


}
