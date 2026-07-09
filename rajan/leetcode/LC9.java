import java.util.Scanner;

public class LC9 {

    public static boolean pald(int number) {

        if (number < 0) {
            return false;
        }

        int temp = number;
        int reversedNumber = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp /= 10;
        }

        return number == reversedNumber;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        boolean result = pald(number);

        if (result) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is Not a Palindrome Number.");
        }

        input.close();
    }
}