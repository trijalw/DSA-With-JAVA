import java.util.Scanner;

public class Palindrome {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        String [] words = b.split(" ");
        String c = "";
        String d = "";
        for (int i = a.length()-1;i>=0;i--) {
            c = c+a.charAt(i);
        }
        if (a.equals(c)) {
            System.out.println("String 1 is a palindrome");
        }
        for (int i = words.length-1;i>=0;i--) {
            d = d+words[i]+" ";
        }
        d = d.trim();
        if (d.equals(b)) {
            System.out.println("String 2 is a palindrome");
        }

        sc.close();
    }
}

// StringBuilder sb = new StringBuilder(a);
// sb = sb.reverse();

