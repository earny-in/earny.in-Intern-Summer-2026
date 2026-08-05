import java.util.Scanner;

public class earnylogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            // E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == mid || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i != 0) ||
                    (j == n - 1 && i != 0) ||
                    (i == 0 && j > 0 && j < n - 1) ||
                    (i == mid))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 ||
                    i == 0 ||
                    i == mid ||
                    (j == n - 1 && i > 0 && i < mid) ||
                    (i - j == mid))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // Y
            for (int j = 0; j < n; j++) {
                if ((i <= mid && (j == i || j == n - 1 - i)) ||
                    (i > mid && j == mid))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        sc.close();
    }
}