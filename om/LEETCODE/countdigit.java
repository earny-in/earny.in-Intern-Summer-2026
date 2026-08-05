import java.util.Scanner;

public class countdigit {

    public static int countDigits(int num) {

        int original = num;
        int count = 0;

        while (num != 0) {

            int digit = num % 10;

            if (digit != 0 && original % digit == 0) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println("Count = " + result);

        sc.close();
    }
}