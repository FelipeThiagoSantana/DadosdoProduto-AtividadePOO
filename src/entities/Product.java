package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;


    //Construtor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Sobrecarga de metodos
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    //getters e setters:
    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice (Double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }


    //Calculo de valor em estoque
    public double totalValueInStock(){

        return  price * quantity;
    }
    //Adicionado adicionando itens no estoque
    public void addProducts(int quantity){

        this.quantity += quantity;
    }

    //Removendo itens
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                +", $"
                +String.format("%.2f", price)
                +", "
                +quantity
                +" units, Total: $"
                +String.format("%.2f", totalValueInStock());

    }


}
