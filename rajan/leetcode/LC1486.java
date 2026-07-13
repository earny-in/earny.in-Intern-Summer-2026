import java.util.Scanner;

public class LC1486 {

    public static int findXOR(int n, int start) {

        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= (start + (2 * i));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.println("Answer = " + findXOR(n, start));

        sc.close();
    }
}