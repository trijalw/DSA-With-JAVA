
import java.util.Scanner;

public class Removespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String [] words = a.split(" ");
        for (String word : words) {
            System.out.print(word);
        }
        sc.close();
    }
}
        // StringBuilder Way
        // String a = sc.nextLine();
        // StringBuilder result = new StringBuilder();

        // for (int i = 0; i < a.length(); i++) {
        //     if (!Character.isWhitespace(a.charAt(i))) {
        //         result.append(a.charAt(i));
        //     }
        // }
