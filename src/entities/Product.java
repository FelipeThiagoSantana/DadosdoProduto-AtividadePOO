package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;


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
