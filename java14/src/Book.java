public class Book {
    private String name;
    private AuthorClass authorClass;
    private double price;
    private int qty;

    public Book(String name, AuthorClass authorClass, double price, int qty){
        this.name = name;
        this.authorClass = authorClass;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public AuthorClass getAuthorClass() {
        return authorClass;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "'" + name + "' buy " + authorClass;
    }
}
