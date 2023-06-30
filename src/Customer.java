import java.util.List;

class Customer {
    private String name;
    private int cartItemCount;
    private List<Product> products;

    public Customer(String name, int cartItemCount) {
        this.name = name;
        this.cartItemCount = cartItemCount;
    }

    public String getName() {
        return name;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }

    public void addToCart(Product product) {
        this.products.add(product);
    }
}
