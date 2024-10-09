import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner =new Scanner(System.in);

        //Instanciando product
        Product product = new Product();


        //Cadastro de produtos
        System.out.println("Enter  product data");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price:");
        product.price = scanner.nextDouble();
        System.out.println("Quantity in stock:");
        product.quantity = scanner.nextInt();

        System.out.println(product.toString());

    }
}