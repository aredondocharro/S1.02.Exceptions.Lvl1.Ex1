import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sale cart = new Sale();
        try {
            double total = cart.CalculateTotalPrice();
            System.out.println("The total price of your cart is " + total + "€");
        } catch (EmptyShoppingCartException e) {
            System.out.println("ERROR: " + e.getMessage());

        }

        Product product1 = new Product("Iphone 15", 1200.0);
        Product product2 = new Product("Pencil", 0.50);
        Product product3 = new Product("TV Screen", 550.00);


        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        try {
            double total = cart.CalculateTotalPrice();
            System.out.println("The total price of your cart is " + total + "€");
        } catch (EmptyShoppingCartException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            System.out.println(cart.getProducts(6).toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}