import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                answer.add("Fizz");
            }
            else if (i % 5 == 0) {
                answer.add("Buzz");
            }
            else {
                answer.add(String.valueOf(i));
            }
        }

        System.out.println("\nFizzBuzz Output:");

        for (String value : answer) {
            System.out.println(value);
        }

        sc.close();
    }
}