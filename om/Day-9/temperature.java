import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] temperature = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperature[i] = sc.nextInt();
        }

        System.out.println("\nWeekly Temperature Report");

        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperature[i] + "°C");
        }

        sc.close();
    }
}