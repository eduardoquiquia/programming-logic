package Encapsulamiento;

public class Product {
    private String code;
    private String description;
    private double price;
    private int quantity;

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
        quantity++;
    }

    public Product(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String GetCode() {
        return code;
    }

    public void SetCode(String code) {
        this.code = code;
    }

    public String GetDescription() {
        return description;
    }

    public void SetDescription() {
        this.description = description;
    }

    public double GetPrice() {
        return price;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    private void Valitation() {
        if (code.length() != 8) {
            code = " ";
            description = " ";
            price = 0;
            quantity--;
        }
    }
}
