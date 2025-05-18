import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        // 1 indexed
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // divisible by both so add fizzbuzz
                result.add("FizzBuzz");
            } else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(Integer.toString(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FizzBuzz fb = new FizzBuzz();
        List<String> output = fb.fizzBuzz(n);

        System.out.println("FizzBuzz Output:");
        for (String s : output) {
            System.out.print(s+"\t");
        }

        sc.close();
    }
}
