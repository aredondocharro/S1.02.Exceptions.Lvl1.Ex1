public class EmptyShoppingCartException extends Exception{

    public EmptyShoppingCartException() {
        super("The shopping cart is empty. To do a sale you need to add products first.");
    }
}

