import java.util.Scanner;

public class AddOneToEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;
            digit = (digit + 1) % 10; // handles 9 -> 0
            result = digit * place + result;
            place *= 10;
            n /= 10;
        }

        System.out.println("Result: " + result);
    }
}

