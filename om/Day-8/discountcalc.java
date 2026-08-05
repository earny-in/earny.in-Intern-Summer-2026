import java.util.Scanner;

public class discountcalc {

    public static double calculateDiscount(double originalPrice, double discountPercentage) {

        double discountAmount = originalPrice * discountPercentage / 100;

        double finalPrice = originalPrice - discountAmount;

        return finalPrice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Original Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        double payable = calculateDiscount(price, discount);

        System.out.println("Final Payable Amount = " + payable);

        sc.close();
    }
}