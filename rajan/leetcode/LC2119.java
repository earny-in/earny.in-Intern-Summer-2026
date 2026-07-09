import java.util.Scanner;

public class LC2119 {

    public static boolean checkNumber(int number) {

        if (number == 0) {
            return true;
        }

        return number % 10 != 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (checkNumber(number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        input.close();
    }
}