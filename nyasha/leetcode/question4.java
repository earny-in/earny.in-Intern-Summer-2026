import java.util.Scanner;

public class question4 {

    public static int numberOfSteps(int num) {

        int steps = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = numberOfSteps(num);

        System.out.println("Number of steps = " + result);

        scanner.close();
    }
}