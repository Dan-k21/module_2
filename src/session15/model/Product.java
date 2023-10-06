package session15.model;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private String category;
    static int idIncrement = 1;
    public Product(String name, int quantity, int price, String category) {
        this.id = idIncrement;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        idIncrement++;
    }

}
