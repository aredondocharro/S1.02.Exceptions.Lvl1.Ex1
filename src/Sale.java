import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = totalPrice;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public Product getProducts(int i) {
        if (i >= products.size()) {
            throw new IndexOutOfBoundsException("Index Out Of Limits");
        }
        return products.get(i);
    }

    public double CalculateTotalPrice() throws EmptyShoppingCartException {
        double totalPrice = 0;
        if (products.isEmpty()) {
            throw new EmptyShoppingCartException();
        }
        for (Product products : products) {
            totalPrice += products.getPrice();
        }
        return totalPrice;
    }


}
