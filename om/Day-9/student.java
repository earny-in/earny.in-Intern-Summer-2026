import java.util.Scanner;

public class student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = new String[5];

        for (int i = 0; i < 5; i++) {
         System.out.print("Student " + (i + 1) + ": ");
         students[i] = sc.nextLine();
        }

        System.out.println("\nstudents list");

        for (int i = 0; i < 5; i++) {
         System.out.println((i + 1) + ". " + students[i]);
        }

        sc.close();
    }
}