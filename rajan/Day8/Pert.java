import java.util.Scanner;

public class Pert {

    public static double calculate_percentage(double mark_obt, double mark_max) {
        return (mark_obt / mark_max) * 100;
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks obtained: ");
        double mark_obt = sc.nextDouble();

        System.out.print("Maximum Marks: ");
        double mark_max = sc.nextDouble();

        double percentage = calculate_percentage(mark_obt, mark_max);

        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}