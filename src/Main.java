public class Main {
    public static void main(String[] args) {
        Sale cart1 = new Sale();
        ExceptionTester test1 = new ExceptionTester(cart1);

        System.out.println("Testing IndexOutOfBoundsExceptions with empty cart (always forced)");
        test1.forceIndexOutOfBoundsExceptions();
        System.out.println("\n");

        System.out.println("Testing EmptyCartException with empty cart");
        test1.forceThrowsEmptyCartException();
        System.out.println("\n");

        Product product1 = new Product("Iphone 15", 1200.0);
        Product product2 = new Product("Pencil", 0.50);
        Product product3 = new Product("TV Screen", 550.00);

        System.out.println("Adding products to the cart and test again");
        System.out.println("\n");
        cart1.addProduct(product1);
        cart1.addProduct(product2);
        cart1.addProduct(product3);


        System.out.println("Testing IndexOutOfBoundsExceptions with 3 products in cart (always forced)");
        test1.forceIndexOutOfBoundsExceptions();
        System.out.println("\n");

        System.out.println("Testing EmptyCartException with 3 products in cart");
        test1.forceThrowsEmptyCartException();


    }
}