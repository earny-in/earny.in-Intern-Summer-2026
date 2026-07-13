import java.util.ArrayList;
import java.util.List;

public class question3{

    public static void main(String[] args) {
        int n = 15; // Change this value as needed

        List<String> result = fizzBuzz(n);

        System.out.println(result);
    }

    public static List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                answer.add("Fizz");
            } 
            else if (i % 5 == 0) {
                answer.add("Buzz");
            } 
            else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}