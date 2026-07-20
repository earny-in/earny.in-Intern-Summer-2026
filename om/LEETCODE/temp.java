import java.util.Scanner;
public class temp {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[] {kelvin, fahrenheit};
    }

    public static void main(String[] args) {
       System.out.println("enter your temperature in celsius");
         Scanner sc =new Scanner(System.in);
         double celsius = sc.nextDouble();
         double[] result = convertTemperature(celsius);
         System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
