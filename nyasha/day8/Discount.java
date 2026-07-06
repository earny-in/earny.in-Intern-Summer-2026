import java.util.Scanner;

public class Discount {

    // Function to calculate final price after discount
    public static double calculate_discount(double originalPrice, double discountPercentage) {

        double discountAmount = (originalPrice * discountPercentage) / 100;
        double finalPrice = originalPrice - discountAmount;

        return finalPrice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Original Price: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Discount Percentage: ");
        double discountPercentage = sc.nextDouble();

        // Calling the function
        double finalPrice = calculate_discount(originalPrice, discountPercentage);

        // Calculating discount amount for display
        double discountAmount = (originalPrice * discountPercentage) / 100;

        // Displaying output
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);

        sc.close();
    }
}