import java.util.Scanner;

public class calculatebill{

public static double calcbill(int quantity, double price) {
 double totalbill = quantity * price;
 return totalbill;
}

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter units: ");
      int units = sc.nextInt();

      System.out.print("Enter price per unit: ");
      double price = sc.nextDouble();

      double bill = calcbill(units, price);
      System.out.println("Total bill: " + bill);

      sc.close();

   }


}