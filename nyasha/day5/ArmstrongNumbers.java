import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many Armstrong numbers to print: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;

        while (count < n) {
            int temp = num;
            int digits = 0;

            // Count the number of digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            // Handle the case for 0
            if (num == 0) {
                digits = 1;
            }

            temp = num;
            int sum = 0;

            // Calculate sum of digits raised to the power of total digits
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            // Check if Armstrong number
            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        sc.close();
    }
}