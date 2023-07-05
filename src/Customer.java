import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Customer<T extends Product> {
    private final String name;
    private final int cartItemCount;
    private final List<T> products;

    public Customer(String name, int cartItemCount) {
        this.name = name;
        this.cartItemCount = cartItemCount;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }

    public void addToCart(T product) {
        this.products.add(product);
    }
}

//        In the refactored code, we introduce a type parameter T that extends
//        the Product class. This allows the Customer class to work with any
//        type of Product or its subclasses. The products list is now declared as
//        List<T> to store the generic products. We initialize the products list in
//        the constructor using new ArrayList<>().The addToCart method now takes a
//        parameter of type T to accept any product or its subclass as an argument.
//        This provides type safety and ensures that only valid product types can be
//        added to the customer's cart. Note: Please ensure that the Product class
//        or its subclass is defined before using the refactored Customer class.