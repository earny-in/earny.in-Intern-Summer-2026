import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int product = 1;
        int sum = 0;

        // Find product and sum of digits
        while (n > 0) {

            int digit = n % 10;

            product = product * digit;
            sum = sum + digit;

            n = n / 10;
        }

        int answer = product - sum;

        System.out.println("Product - Sum = " + answer);

        sc.close();
    }
}