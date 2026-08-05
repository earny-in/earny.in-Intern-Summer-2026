import java.util.Scanner;

public class perfect {
   public static void main(String[] argsStrings){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the number:-");

      int n= sc.nextInt();
      int sum=0;

      for(int i=1;i<=n;i++){
        int div = n % i;
        if(div == 0){
            sum=sum+i;
        }
      }

      if(sum == n){
        System.out.println(n + " is a perfect number.");
      } else {
        System.out.println(n + " is not a perfect number.");
      }

   }


}