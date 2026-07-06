import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter expense for Day " + i + ": ");
            int expense = sc.nextInt();

            total += expense;
        }

        int average = total / 5;

        System.out.println("Total Expense: " + total);
        System.out.println("Average Daily Expense: " + average);

        sc.close();
    }
}