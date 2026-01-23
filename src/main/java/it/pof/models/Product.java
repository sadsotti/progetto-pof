package it.pof.models;

public class Product {
    private int id;
    private String insertionDate;
    private String name;
    private String brand;
    private String price;
    private boolean available;

    public Product(int id, String insertionDate, String name, String brand, String price, boolean available) {
        this.id = id;
        this.insertionDate = insertionDate;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getInsertionDate() { return insertionDate; }
    public String getBrand() { return brand; }
    public String getPrice() { return price; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return String.format("ID: %d | %s | %s | %s | Price: %s | Available: %s", 
                id, insertionDate, name, brand, price, available ? "YES" : "NO");
    }

    public String toCsvRow() {
        return id + ";" + insertionDate + ";" + name + ";" + brand + ";" + price;
    }
}
