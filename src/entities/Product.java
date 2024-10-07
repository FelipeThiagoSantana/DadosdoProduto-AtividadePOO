package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return  price * quantity;
    }
}
