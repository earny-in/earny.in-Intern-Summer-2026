import java.util.Scanner;

public class LC2520 {

    public static int countDivisibleDigits(int number) {

        int temp = number;
        int total = 0;
        while (temp > 0) {
            int digit = temp % 10;

            if (digit != 0 && number % digit == 0) {
                total++;
            }

            temp /= 10;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int answer = countDivisibleDigits(number);

        System.out.println("Count = " + answer);

        input.close();
    }
}