import java.util.Scanner;

public class LC507 {

    public static boolean isPerfect(int number) {

        if (number == 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {

                sum += i;

                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is Not a Perfect Number.");
        }

        sc.close();
    }
}