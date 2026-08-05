import java.util.Scanner;

public class question11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;

        System.out.println("Temperature in Kelvin: " + kelvin);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}