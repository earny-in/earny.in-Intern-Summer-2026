import java.util.Scanner;

public class two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Outer loop -> Rows
        for (int row = 1; row <= n; row++) {

            // Inner loop -> Stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}