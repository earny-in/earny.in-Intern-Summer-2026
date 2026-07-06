import java.util.Scanner;

public class Information {
    
    public static void employee_info(String name, int salary) {
        System.out.println("Employee Details");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        int salary = scanner.nextInt();
        
        employee_info(name, salary);
        
        scanner.close();
    }
}