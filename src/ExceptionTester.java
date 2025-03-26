public class ExceptionTester {

    private final Sale cart;

    public ExceptionTester(Sale cart) {
        this.cart = cart;
    }

    public void forceThrowsEmptyCartException() {
        try {
            double total = cart.CalculateTotalPrice();
            System.out.println("Total price in cart : " + total+ "€");
        } catch (EmptyShoppingCartException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void forceIndexOutOfBoundsExceptions() {
        try {
            System.out.println(cart.getProducts().get(cart.getProducts().size()));

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());


        }
    }
}

