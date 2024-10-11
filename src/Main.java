import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int quantity;
        String name;
        double price;
        Scanner scanner =new Scanner(System.in);


        //Cadastro de produtos
        System.out.println("Enter  product data");
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Price:");
        price = scanner.nextDouble();

        //Chamando o Construtor
        Product product = new Product(name,price);

        System.out.println();
        System.out.println("Product data: "+product);

        //Adicionando produto no estoque
        System.out.println();
        System.out.print("Enter the number of product to be added in stock: ");
        quantity = scanner.nextInt();
        product.addProducts(quantity);

        //Atualizando o produto
        System.out.println();
        System.out.println("Updated data product: "+product);
        System.out.println();

        //removendo produtos do estoque
        System.out.print("Enter the number of product to be removed in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        //Atualizando produto
        System.out.println();
        System.out.println("Updated data product: "+product);
    }
}