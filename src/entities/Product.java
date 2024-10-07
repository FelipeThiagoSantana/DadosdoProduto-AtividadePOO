package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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


}
