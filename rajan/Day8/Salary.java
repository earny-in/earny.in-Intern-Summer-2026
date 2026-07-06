import java.util.Scanner;

public class Salary {

    public static double calculate_annual_salary(double monthlySalary) {
        return monthlySalary * 12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Monthly Salary: ");
        double monthlySalary = sc.nextDouble();

        double annualSalary = calculate_annual_salary(monthlySalary);

        System.out.println("Annual Salary: " + annualSalary);

        sc.close();
    }
}