import java.util.Scanner;

public class water {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] water = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            water[i] = sc.nextInt();
        }

        System.out.println("\nWeekly Water Intake");

        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1) + " : " + water[i] + " Glasses");
        }

        sc.close();
    }
}