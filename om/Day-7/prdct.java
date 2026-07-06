import java.util.Scanner;

public class prdct {

    public static void product_details(String product_name, double price) {
        System.out.println("Product Details");
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String product_name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        product_details(product_name, price);

        sc.close();
    }
}