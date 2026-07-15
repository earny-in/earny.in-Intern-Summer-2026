import java.util.Scanner;

public class nth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        if (n == 1) {
            System.out.println("Nth Fibonacci Number = " + first);
        } else if (n == 2) {
            System.out.println("Nth Fibonacci Number = " + second);
        } else {

            int next = 0;

            for (int i = 3; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("Nth Fibonacci Number = " + second);
        }

        sc.close();
    }
}